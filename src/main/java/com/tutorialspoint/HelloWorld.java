package com.tutorialspoint;

import org.springframework.beans.factory.DisposableBean;

public class HelloWorld implements DisposableBean {
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

    @Override
    public void destroy() {
        System.out.println("destroy called!");
    }
}