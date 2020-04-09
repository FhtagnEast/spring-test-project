package com.fhtagneast.helloworld;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

    public static void main(String... args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:hello-config.xml");
        context.refresh();
        HelloWorld helloWorld = context.getBean(HelloWorld.class);

        helloWorld.greeting();

    }
}
