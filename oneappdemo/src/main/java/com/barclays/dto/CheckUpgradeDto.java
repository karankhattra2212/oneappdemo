package com.barclays.dto;

import org.springframework.stereotype.Component;

@Component
public class CheckUpgradeDto {
    private String vNumber;

    public String getvNumber() {
        return vNumber;
    }

    @Override
    public String toString() {
        return "CheckUpgrade{" +
                "vNumber='" + vNumber + '\'' +
                '}';
    }

    public CheckUpgradeDto() {
            }

    public void setvNumber(String vNumber) {
        this.vNumber = vNumber;
    }
}
