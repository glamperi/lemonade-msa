package com.ciber.beveragevendor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

/***
 * Simplest Beverage Vendor Service
 *
 * Provides a serving of lemonade
 */
@Slf4j
@SpringBootApplication
public class BeverageVendorService {
    public static void main(String[] args) {
        System.setProperty("spring.output.ansi.enabled", "never");
        System.setProperty("server.port", "8080");
        log.info("start");
        SpringApplication application = new SpringApplication(BeverageVendorService.class);
        application.run(args);

    }
}
