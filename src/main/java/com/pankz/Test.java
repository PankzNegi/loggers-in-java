package com.pankz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
    private static final Logger log= LogManager.getLogger(Test.class); //Logger object

    public static void main(String[] args) {
        processData();
    }
    public static void processData()
    {
        //Priority Methods
        log.trace("FROM TRACE METHOD");
        log.debug("FROM DEBUG METHOD");
        log.info("FROM INFO METHOD");
        log.warn("FROM WARN METHOD");
        log.error("FROM ERROR METHOD");
        log.fatal("FROM FATAL METHOD");

        //..read input
        //..validate them
        //..store in db
        //..return them
    }
}
//private becauase we want to check within the same class(within the class it is useful)
//static becoz accessing any type of method
//When logger created we don't want to modify hence final