package com.service;

import java.util.List;

import com.entity.Item;
import com.repository.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;
    
    public List<Item> getItem(){
        return itemRepository.findAll();
    }
}
