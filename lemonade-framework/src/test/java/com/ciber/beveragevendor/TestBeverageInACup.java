package com.ciber.beveragevendor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class TestBeverageInACup {

    @Test
    void testBeverageCup() {
        BeverageInACup cup = new BeverageInACup();
        assertNotNull(cup);
    }

    @Test
    void testBeverageCupServingCupBeverageServing() {
        BeverageServing serving = new BeverageServing("lemonade", 8);
        ServingCup cup = new ServingCup("small");

        BeverageInACup cupAndServing = new BeverageInACup(cup, serving);
        assertNotNull(cupAndServing);
        assertEquals(8, cupAndServing.getBeverageAmount());
        assertEquals("lemonade", cupAndServing.getContents());
        assertEquals("small", cupAndServing.getCupSize());
    }

}
