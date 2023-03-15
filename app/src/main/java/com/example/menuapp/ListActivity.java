package com.example.menuapp;

private class ListActivity {

    private int img;
    private String rname;
    private int distance;
    private double star;

    public ListActivity(int img, String rname, int distance, double star){
        this.img = img;
        this.rname = rname;
        this.distance = distance;
        this.star = star;
    }

    public int getImg() {
        return img;
    }

    public String getRname() {
        return rname;
    }

    public int getDistance() {
        return distance;
    }

    public double getStar() {
        return star;
    }


}
