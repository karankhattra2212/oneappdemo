package com.barclays.oneappdemo.dto;

import java.util.Date;

public class ErrorDetailsDTO {
    private Date timestamp;
    private String message;
    private String details;

    public ErrorDetailsDTO(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

}