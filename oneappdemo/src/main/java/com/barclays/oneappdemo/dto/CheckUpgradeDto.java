package com.barclays.dto;

import org.springframework.stereotype.Component;

@Component
public class CheckUpgradeDto {
    private double vNumber;
    private Double vReq;

    public Double getvNumber() {
        return vNumber;
    }

    public void setvNumber(Double vNumber) {
        this.vNumber = vNumber;
    }

    public Double getvReq() {
        return vReq;
    }

    @Override
    public String toString() {
        return "CheckUpgradeDto{" +
                "vNumber=" + vNumber +
                ", vReq=" + vReq +
                '}';
    }

    public void setvReq(Double vReq) {
        this.vReq = vReq;
    }
}
