package com;

import com.controller.ItemController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(ItemController.class)
public class ItemControllerTest {
    
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetItem() throws Exception{
        RequestBuilder request = MockMvcRequestBuilders
                                    .get("/getitem")
                                    .accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(request)
                            .andExpect(status().isOk()) // assert status
                            .andExpect(content().json("{\"id\" : 1, \"name\" : \"Item A\", \"stock\" : 20}")) // assert json
                            .andReturn();
        
    }
}
