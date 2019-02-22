package com.ciber.beveragevendor;

import lombok.Data;

/***
 * Represents a serving of lemonade.
 *
 */
@Data
public class BeverageServing {
    final String product = "Beverage";
    final String units = "ounces";
    String beverageType;
    int amount;

    public BeverageServing() {
    }

    public BeverageServing(String beverageType, int amount) {
        this.beverageType = beverageType;
        this.amount = amount;
    }
}
