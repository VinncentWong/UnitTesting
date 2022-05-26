package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.entity.Item;
import com.repository.ItemRepository;
import com.service.ItemService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ItemServiceTest {
    
    @Mock
    private ItemRepository itemRepository;

    @InjectMocks
    private ItemService itemService;

    @Test
    public void getAllItemData(){
        when(itemRepository.findAll()).thenReturn(Arrays.asList(new Item(1L, "Item A", 20)));
        List<Item> list = itemService.getItem();
        assertEquals(list.get(0).getName(), "Item A");
    }
}
