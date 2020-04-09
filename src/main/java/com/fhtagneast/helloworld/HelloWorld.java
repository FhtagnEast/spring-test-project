package com.fhtagneast.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorld.class);

    private final String phrase;

    public HelloWorld(String phrase) {
        this.phrase = phrase;
    }

    public HelloWorld bean() {
        return this;
    }

    public void greeting() {
        LOGGER.info(phrase);
    }
}
