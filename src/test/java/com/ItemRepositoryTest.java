package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import com.entity.Item;
import com.repository.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class ItemRepositoryTest {
    
    @Autowired
    private ItemRepository itemRepository;

    public void testFindAll(){
        List<Item> list = itemRepository.findAll();
        assertEquals(0, list.size());
    }
}
