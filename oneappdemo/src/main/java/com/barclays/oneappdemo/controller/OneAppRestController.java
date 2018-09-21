package com.barclays.oneappdemo.controller;

import com.barclays.oneappdemo.dao.CustomerJPARepository;
import com.barclays.oneappdemo.dao.DeviceJPARepository;
import com.barclays.oneappdemo.dao.OneAppDaoTnC;
import com.barclays.oneappdemo.dto.CustomerDTO;
import com.barclays.oneappdemo.dto.DeviceDTO;
import com.barclays.oneappdemo.dto.ErrorDetailsDTO;
import com.barclays.oneappdemo.request.DeviceRequest;
import com.barclays.oneappdemo.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@ControllerAdvice
@RestController
public class OneAppRestController extends ResponseEntityExceptionHandler {

    @Autowired
    private CustomerJPARepository customerJPARepository;

    @Autowired
    private DeviceJPARepository deviceJPARepository;

    @Autowired
    private OneAppDaoTnC oneAppDaoTnC;

    @Autowired
    private DeviceService deviceService;


    @PostMapping(value = "/saveTermsAndCond")
    public ResponseEntity<String> saveTermsAndCond(@Valid @RequestBody DeviceRequest device){
        if(deviceService.checkDeviceID(device.getDeviceid())){

            CustomerDTO cust = new CustomerDTO();
            DeviceDTO deviceDTO = new DeviceDTO();

            cust.setCustomerid(com.barclays.oneappdemo.util.OneAppUtil.generateCustID(device.getDeviceid()));
            cust.setTitle("NA");
            cust.setTnc('Y');
            cust.setState("Active");
            deviceDTO.setDeviceid(device.getDeviceid());
            deviceDTO.setLastmodified(new Timestamp(System.currentTimeMillis()));
            deviceDTO.setCustomer(cust);

            device.setLastmodified(new Timestamp(System.currentTimeMillis()));

            customerJPARepository.save(cust);
            deviceJPARepository.save(deviceDTO);

            return ResponseEntity.status(HttpStatus.CREATED).build();
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @GetMapping(value = "/getTermsAndCond")
    public String getTermsAndCond() {
        return oneAppDaoTnC.getLatestTnC().getTerm_desc();

    }

    @GetMapping("/customers")
    public List<CustomerDTO> retrieveAllCustomers(){
        return customerJPARepository.findAll();
    }

    @GetMapping("/Device")
    public List<DeviceDTO> retrieveAllDevices(){
        return deviceJPARepository.findAll();
    }

    protected ResponseEntity<Object> handleMethodArguementNotValid(MethodArgumentNotValidException ex){
        ErrorDetailsDTO errorDetailsDTO = new ErrorDetailsDTO(new Date(), "Vallidation Failed",
                ex.getBindingResult().toString());
        return new ResponseEntity<>(errorDetailsDTO, HttpStatus.BAD_REQUEST);

    }




}

