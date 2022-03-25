package com.student.gradedataservice.Exception;

public class GetGradeException extends Exception{
    String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public GetGradeException(String message) {
        this.message = message;
    }

    @Override
    public String toString(){
        return this.getClass().getName()+" : "+this.getMessage();
    }
}
