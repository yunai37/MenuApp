package com.example.menuapp;

public class ListItem {
    private int id;
    private String name;
    private String address;
    private String business_hours;
    private String phone_number;
    private String category_name;
    private int image;

    public ListItem (int id, String name, String address, String business_hours, String phone_number,
                     String category_name, int image){
        this.id = id;
        this.name = name;
        this.address = address;
        this.business_hours = business_hours;
        this.phone_number = phone_number;
        this.category_name = category_name;
        this.image = image;
    }

    public int getId(){ return this.id; }
    public String getName() { return this.name; }
    public String getAddress() { return this.address; }
    public String getBusiness_hours() { return this.business_hours; }
    public String getPhone_number() { return this.phone_number; }
    public String getCategory_name() { return this.category_name; }
    public int getImage() { return this.image; }
}
