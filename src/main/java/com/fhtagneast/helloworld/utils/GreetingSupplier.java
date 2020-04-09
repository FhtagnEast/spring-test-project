package com.fhtagneast.helloworld.utils;

public class GreetingSupplier implements StringSupplier {

    @Override
    public String supplyMessage() {
        return "Hello, that's Spring ANNOTATION greeting!";
    }
}
