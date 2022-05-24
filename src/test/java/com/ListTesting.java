package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ListTesting {
    
    @Mock
    private List<String> list;

    @Test
    public void testGenericWithList(){
        when(list.get(anyInt())).thenReturn("Numeric value");
        assertEquals("Numeric value", list.get(0));
    }

    @Test
    public void verifyMethodCalls(){
        String a = list.get(0);
        String b = list.get(1);

        verify(list, times(2)).get(anyInt());
        verify(list, atLeast(1)).get(0);
        verify(list, never()).get(2);
    }
}
