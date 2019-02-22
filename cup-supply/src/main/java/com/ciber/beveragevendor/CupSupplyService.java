package com.ciber.beveragevendor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

/***
 * Simplest Lemonade Supply Service
 * 
 * @author Mark
 *
 *         Provides a serving of lemonade
 */
@Slf4j
@SpringBootApplication
public class CupSupplyService {

    public static void main(String[] args) {
        log.info("start");
        System.setProperty("server.port", "8080");
        SpringApplication.run(CupSupplyService.class, args);
    }

}
