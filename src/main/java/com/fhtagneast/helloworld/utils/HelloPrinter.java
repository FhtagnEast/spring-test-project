package com.fhtagneast.helloworld.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloPrinter implements StringPrinter {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloPrinter.class);

    private StringSupplier supplier;

    @Override
    public void printString() {
        if (supplier == null) {
            LOGGER.warn("Supplier is not setted!");
        } else {
            LOGGER.info(supplier.supplyMessage());
        }
    }

    @Override
    public void setStringSupplier(StringSupplier supplier) {
        this.supplier = supplier;
    }
}
