package com.tutorialspoint;

public class HelloWorld {
    private String message;

    public void setMessage(String message){
        System.out.println("setting message to " + message);
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

    public void init() {
        System.out.println("init called!");
    }

}