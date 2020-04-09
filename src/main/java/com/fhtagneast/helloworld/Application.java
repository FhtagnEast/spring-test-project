package com.fhtagneast.helloworld;

import com.fhtagneast.helloworld.utils.HelloConfiguration;
import com.fhtagneast.helloworld.utils.StringPrinter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String... args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloConfiguration.class);

        StringPrinter helloPrinter = context.getBean(StringPrinter.class);
        helloPrinter.printString();
    }
}
