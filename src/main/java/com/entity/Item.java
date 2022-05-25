package com.entity;

public class Item {
    private Long id;
    private String name;
    private int stock;
    public Item(Long id, String name, int stock) {
        this.id = id;
        this.name = name;
        this.stock = stock;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
