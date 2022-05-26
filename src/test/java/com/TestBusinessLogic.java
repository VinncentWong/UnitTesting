package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class TestBusinessLogic {

    @InjectMocks
    private Service service;

    // @Mock
    // private Repository repository; 
    
    @Test
    public void checkIfCalculateSumIsTrue(){
        int actual = service.calculateSumArray(new int[]{1,2,3,4,5});
        int expected = 15;
        assertEquals(expected, actual);
    }

    // atau

    // @Test
    // public void checkIfCalculateSumIsTrueUsingMock(){
    //     when(repository.getSomeData()).thenReturn(new int[] {1,2,3,4,5});
    //     int expected = 15;
    //     assertEquals(expected, service.calculateSumArray(repository.getSomeData()));
    // }

    

}
