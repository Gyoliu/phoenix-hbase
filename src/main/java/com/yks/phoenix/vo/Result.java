package com.yks.phoenix.vo;

/**
 * Created by cgt on 17-12-7.
 */
public class Result {

    boolean status;
    String message;

    public Result(boolean status, String message) {
        this.status = status;
        this.message = message;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
