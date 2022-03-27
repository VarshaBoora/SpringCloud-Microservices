package com.admin.service.exception;

public class AdminException extends Exception{
    String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AdminException(String message) {
        this.message = message;
    }

    @Override
    public String toString(){
        return this.getClass().getName()+" : "+this.getMessage();
    }
}
