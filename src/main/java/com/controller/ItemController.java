package com.controller;

import java.util.List;

import com.entity.Item;
import com.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;
    
    @GetMapping("/getitem")
    public Item getItem(){
        return new Item(1L, "Item A", 20);
    }

    @GetMapping("/getitemservice")
    public List<Item> getItemFromService(){
        return itemService.getItem();
    }
}
