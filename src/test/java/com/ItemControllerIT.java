package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.web.client.RestTemplate;

// IT stands for Integration Test
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT) // annotated the class will do integration test
public class ItemControllerIT {

    @Test
    public void contextLoads(){
        String response = new RestTemplate().getForObject("/getitemservice", String.class);
        assertEquals("[{}]", response);
    }
}
