package com.edder.restaurante_ec3.model;

public class Platos extends Shows {

    private String platoName;
    public Platos(String name, String imgUrl, String description) {
        super(name, imgUrl);
        this.platoName = platoName;
    }

    public String getPlatoNameName() {
        return platoName;
    }

    public void setPlatoNameName(String sagaName) {
        this.platoName = platoName;
    }
}
