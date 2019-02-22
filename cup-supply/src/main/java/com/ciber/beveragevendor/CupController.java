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
@RequestMapping("/cup")
public class CupController {

    @GetMapping("/{size}")
    public ServingCup getServing(@PathVariable String size) {
        log.info("LemonadeServing {}", size);
        return new ServingCup(size);
    }

}
