package com.student.courseinfoservice.exception;

public class CourseException extends Exception{
    String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CourseException(String message) {
        this.message = message;
    }

    public CourseException(String message, String message1) {
        super(message);
        this.message = message1;
    }
}
