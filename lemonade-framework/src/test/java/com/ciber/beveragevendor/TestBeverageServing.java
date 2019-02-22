package com.ciber.beveragevendor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class TestBeverageServing {

    @Test
    void testBeverageServing() {
        BeverageServing serving = new BeverageServing();
        assertNotNull(serving);
    }

    @Test
    void testBeverageServingStringInt() {
        BeverageServing serving = new BeverageServing("lemonade", 10);
        assertNotNull(serving);
        assertEquals("lemonade", serving.getBeverageType());
        assertEquals(10, serving.getAmount());
    }

}
