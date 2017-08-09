package com.siemens.controller;

public class ErrorResponse {
    private int cause;
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCause() {
        return cause;
    }

    public void setCause(int cause) {
        this.cause = cause;
    }

    public static ErrorResponse createErrorResponse(int cause, String desc){
        //TODO implement here...
        return null;
    }
}
