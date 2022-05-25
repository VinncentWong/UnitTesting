package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.controller.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(Controller.class)
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void helloWorldTest() throws Exception{
        RequestBuilder request = MockMvcRequestBuilders
                                .get("/hello")
                                .accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(request)                           
                            .andReturn();
        assertEquals("Hello World", result.getResponse().getContentAsString());
    }
}
