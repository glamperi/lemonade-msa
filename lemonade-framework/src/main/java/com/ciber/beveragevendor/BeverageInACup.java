package com.ciber.beveragevendor;

import lombok.Data;

/***
 * Represents a serving of a beverage.
 * 
 * Includes a cup and a beverage, and the specified amount of contents.
 *
 */
@Data
public class BeverageInACup {
    final String product = "beverage serving";
    final String units = "size";
    String contents;
    String cupSize;
    int beverageAmount;

    public BeverageInACup() {

    }

    public BeverageInACup(ServingCup cup, BeverageServing serving) {
        this.cupSize = cup.size;
        this.beverageAmount = serving.amount;
        this.contents = serving.beverageType;
    }
}
