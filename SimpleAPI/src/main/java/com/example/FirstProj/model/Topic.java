package com.example.FirstProj.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic{

    @Id
    private int id;
    private String name;
    private int price;

    public Topic(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Topic(){
        this.id = 0;
        this.name = null;
        this.price = 0;
    }

    public Topic(Topic t){
        this.id = t.id;
        this.name = t.name;
        this.price = t.price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
