package com.ciber.beveragevendor;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

/***
 * Controller returns a serving of lemonade as in JSON
 *
 */
@Slf4j
@RestController
@RequestMapping("/beverage")
public class BeverageController {
    public final String cupSupply = "http://cup-supply:8080/cup";
    public final String lemonadeSupply = "http://lemonade-supply:8080/lemonade";

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @GetMapping("/{size}")
    public BeverageInACup getServing(@PathVariable String size, RestTemplate restTemplate) {
        String cupUrl = cupSupply + "/" + size;
        log.info("LemonadeServing {} {}", size, cupUrl);
        ServingCup cup = restTemplate.getForObject(cupUrl, ServingCup.class);
        log.info("ServingCup {}", cup);

        String beverageUrl = lemonadeSupply + "/" + Integer.toString(cup.getOunces());
        log.info("getting beverage {}", beverageUrl);
        BeverageServing serving = restTemplate.getForObject(beverageUrl, BeverageServing.class);
        log.info("BeverageServing {}", serving);

        BeverageInACup cupAndServing = new BeverageInACup(cup, serving);
        log.info("BeverageInACup {}", cupAndServing);
        return cupAndServing;
    }

}
