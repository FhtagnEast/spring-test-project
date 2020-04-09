package com.fhtagneast.helloworld.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {

    @Bean
    public StringPrinter printer() {
        StringPrinter printer = new HelloPrinter();
        printer.setStringSupplier(supplier());
        return printer;
    }

    @Bean
    public StringSupplier supplier() {
        return new GreetingSupplier();
    }

}
