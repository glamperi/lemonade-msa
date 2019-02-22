package com.ciber.beveragevendor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TestServingCup {

    @Test
    void TestNothing() {

    }

    @Test
    void testNewServingCup() {
        ServingCup cup = new ServingCup();
        assertNotNull(cup);
    }

    @Test
    void testNewSmallServingCup() {
        ServingCup cup = new ServingCup("small");
        assertNotNull(cup);
        assertEquals(8, cup.getOunces());
    }

    @Test
    void testNewMediumServingCup() {
        ServingCup cup = new ServingCup("medium");
        assertNotNull(cup);
        assertEquals(12, cup.getOunces());
    }

    @Test
    void testNewLargeServingCup() {
        ServingCup cup = new ServingCup("large");
        assertNotNull(cup);
        assertEquals(16, cup.getOunces());
    }

    @Test
    void testNewIncorrectServingCup() {
        assertThrows(IllegalArgumentException.class, () -> {
            ServingCup cup = new ServingCup("bogus-size");
        });
    }

}
