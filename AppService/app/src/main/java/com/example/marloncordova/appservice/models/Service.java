package com.example.marloncordova.appservice.models;


public class Service {

    private int id;
    private String name;
    private String description;
    private int image;
    private String customer;

    public int getId() {
        return id;
    }

    public Service setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Service setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Service setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getImage() {
        return image;
    }

    public Service setImage(int image) {
        this.image = image;
        return this;
    }

    public static Service build(int id,String name, String description, String customer, int image){
        Service service= new Service();
        service.setId(id).setName(name).setDescription(description).setImage(image).setCustomer(customer);
        return service;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}




