package com.barclays.controller;

import com.barclays.dao.CheckUpgradeDao;
import com.barclays.dto.CheckUpgradeDto;
import com.barclays.dto.OneAppDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckUpgradeRestController {

    @GetMapping(value = "/TestRes")
    public String getTermsAndCond() {
        System.out.print("Inside hello method!!!!!!!!!!!!!!!!");
        return "helloTest";
    }
   /* @RequestMapping(value = "/id")

    String getIdByValue(@RequestParam("id") String personId) {

        System.out.println("ID is " + personId);

        return "Get ID from query string of URL with value element";

    }*/
   @GetMapping(value = "/vNumberCheck/{vNumber}")

   public String vNumberCheck(CheckUpgradeDto checkUpgradeDto,CheckUpgradeDao checkUpgradeDao,@RequestParam ("vNumber") String vNumber) {

    System.out.print(checkUpgradeDto.getvNumber());
       String test="Not find";
      if(vNumber.equalsIgnoreCase(checkUpgradeDto.getvNumber()))
       {
           System.out.print(" if vNumber "+vNumber);
test= checkUpgradeDto.getvNumber()+"you can proceed";
       }else
       {
           System.out.print(" else vNumber "+vNumber);

           test= checkUpgradeDto.getvNumber()+"Please update your app from play store";

       }


       return test;
   }

}