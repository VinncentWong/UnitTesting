package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestBusinessLogic {
    
    @Test
    public void checkIfCalculateSumIsTrue(){
        BusinessLogic logic = new BusinessLogic();
        int actual = logic.calculateSumArray(new int[]{1,2,3,4,5});
        int expected = 15;
        assertEquals(expected, actual);
    }
}
