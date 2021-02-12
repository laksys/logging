package com.king;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class App {
    static Logger log = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {
        BasicConfigurator.configure();
        log.setLevel(Level.INFO);
        log.debug("-----------------");
        log.info ("hello, world!");
        log.debug("-----------------");
    }
    public static int add(int a, int b) {
        return a + b;
    }
}
