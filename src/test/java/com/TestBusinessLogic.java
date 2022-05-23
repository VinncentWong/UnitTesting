package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class TestBusinessLogic {
    
    @Test
    public void checkIfCalculateSumIsTrue(){
        BusinessLogic logic = new BusinessLogic();
        int actual = logic.calculateSumArray(new int[]{1,2,3,4,5});
        int expected = 15;
        assertEquals(expected, actual);
    }

    // atau

    @Test
    public void checkIfCalculateSumIsTrueUsingMock(){
        BusinessLogic logic = new BusinessLogic();
        ILogin retrieveData = mock(ILogin.class);
        when(retrieveData.getSomeData()).thenReturn(new int[] {1,2,3,4,5});
        int expected = 15;
        assertEquals(expected, logic.calculateSumArray(retrieveData.getSomeData()));
    }

}
