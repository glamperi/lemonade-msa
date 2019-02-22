package com.ciber.beveragevendor;

import lombok.Data;

/**
 * Represents a cup which can hold a serving for a beverage
 */
@Data
public class ServingCup {
    final String product = "cup";
    final String units = "size";
    String size;
    int ounces;

    public ServingCup() {

    }

    public ServingCup(String size) {
        this.size = size;
        if (size.equalsIgnoreCase("large")) {
            ounces = 16;
            return;
        }
        if (size.equalsIgnoreCase("medium")) {
            ounces = 12;
            return;
        }
        if (size.equalsIgnoreCase("small")) {
            ounces = 8;
            return;
        }
        // default
        throw new IllegalArgumentException("Ivalid size: " + size);
    }

}
