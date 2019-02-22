package com.ciber.beveragevendor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/***
 * Controller returns a serving of lemonade as in JSON
 *
 */
@Slf4j
@RestController
@RequestMapping("/lemonade")
public class LemonadeController {

    @GetMapping("/{amount}")
    public BeverageServing getServing(@PathVariable Integer amount) {
        log.info("LemonadeServing {}", amount);
        return new BeverageServing("Lemonade", amount);
    }

}
