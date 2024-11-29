package com.mt.sample;

public class HelloWorld {
    public String getMessage() {
        return "Hello, Welcome to FEWA IT Consulting!";
    }

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        System.out.println(hello.getMessage());
    }
}