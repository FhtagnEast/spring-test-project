package com.fhtagneast.helloworld;

import com.fhtagneast.helloworld.utils.StringPrinter;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

    public static void main(String... args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:hello-config.xml");
        context.refresh();

        StringPrinter helloPrinter = context.getBean(StringPrinter.class);
        helloPrinter.printString();
    }
}
