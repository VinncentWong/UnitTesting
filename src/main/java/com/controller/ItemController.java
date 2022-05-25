package com.controller;

import com.entity.Item;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    
    @GetMapping("/getitem")
    public Item getItem(){
        return new Item(1L, "Item A", 20);
    }
}
