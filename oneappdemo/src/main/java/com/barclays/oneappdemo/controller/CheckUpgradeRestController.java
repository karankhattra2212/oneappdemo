package com.barclays.oneappdemo.controller;

//import com.barclays.dao.CheckUpgradeDao;
import com.barclays.dto.CheckUpgradeDto;
import com.barclays.oneappdemo.service.CheckUpgradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckUpgradeRestController {
    @Autowired
    private CheckUpgradeService checkUpgradeService;
    @Autowired
    private CheckUpgradeDto checkUpgradeDto;

    @GetMapping(value = "/TestRes")
    public CheckUpgradeDto getTermsAndCond() {
        System.out.print("Inside hello method!!!!!!!!!!!!!!!!");
        //  System.out.print("value is ************"+checkUpgradeService.getCheckUpgradeById());



        return checkUpgradeService.getCheckUpgradeById();
    }

    /* @RequestMapping(value = "/id")

     String getIdByValue(@RequestParam("id") String personId) {

         System.out.println("ID is " + personId);

         return "Get ID from query string of URL with value element";

     }*/
    @GetMapping(value = "/vNumberCheck/{vNumber}")

    public CheckUpgradeDto vNumberCheck() {

        // System.out.print(checkUpgradeDto.getvNumber());
        String test = "Not find";

         checkUpgradeDto=  checkUpgradeService.getCheckUpgradeById();
        /*if (vNumberequalsIgnoreCase(checkUpgradeDto.getvReq())) {
            returnStatus.setReturnCode("suggestion");
            returnStatus.setReturnDescription("Please Upadte your application");
            return returnStatus;
        } else if(vNumber.equalsIgnoreCase(checkUpgradeDto.getvReq()
                )){
            System.out.print(" else vNumber " + vNumber);
            Mandatory
            test = checkUpgradeDto.getvNumber() + "Please update your app from play store";

        }*/


        return checkUpgradeDto;
    }

}
