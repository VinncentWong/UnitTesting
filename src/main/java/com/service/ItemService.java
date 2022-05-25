package com.service;

import com.entity.Item;

import org.springframework.stereotype.Service;

@Service
public class ItemService {
    
    public Item getItem(){
        return new Item(1L, "Item A", 20);
    }
}
