package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ListTesting {
    
    @Mock
    private List<String> list;

    @Spy
    private ArrayList<String> spyList;

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

    @Test
    public void parameterCapture(){
        list.add("Hello World");
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

        verify(list).add(captor.capture()); // captor.capture() catch the argument in list
        assertEquals("Hello World", captor.getValue());
    }

    @Test
    public void multipleParameterCapture(){
        list.add("Test 1");
        list.add("Test 2");
        list.add("Test 3");

        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

        verify(list, times(3)).add(captor.capture()); // captor.capture() catch the argument in list
        List<String> arguments = captor.getAllValues();
        assertEquals("Test 1", arguments.get(0));
        assertEquals("Test 2", arguments.get(1));
        assertEquals("Test 3", arguments.get(2));
    }

    @Test
    public void spying(){
        spyList.add("1");
        spyList.add("2");
        System.out.println(spyList.size());
        System.out.println(spyList.get(0));
        System.out.println(spyList.get(1));
        when(spyList.size()).thenReturn(5);
        assertEquals("1", spyList.get(0));
        assertEquals(5, spyList.size());
    }
}
