package com.company;

public class Weapon {

    private String tip;
    private String name;

    public Weapon(String tip, String name) {
        this.tip = "M16";
        this.name = "Katana";


    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}