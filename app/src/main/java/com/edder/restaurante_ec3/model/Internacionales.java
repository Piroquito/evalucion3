package com.edder.restaurante_ec3.model;

public class Internacionales extends Shows {
    private int desciption;


    public Internacionales(String name, String imgUrl, int desciption) {
        super(name, imgUrl);
        this.desciption = desciption;
    }

    public int getDesciption() {
        return desciption;
    }

    public void setDesciption(int desciption) {
        this.desciption = desciption;
    }
}
