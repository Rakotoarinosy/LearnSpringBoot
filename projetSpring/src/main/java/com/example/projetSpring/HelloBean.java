package com.example.projetSpring;

public class HelloBean {
    private String message;

    public HelloBean (String message) {
        this.message = message;
    }

    

    /**
     * @return String return the message
     */
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "HelloBean [message=" + message + "]";
    }



    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    
}
