package com.student.studentcatalogservice.exception;

public class StudentCatalogException extends Exception{
    String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString(){
        return this.getClass().getName()+" : "+this.getMessage();
    }
}
