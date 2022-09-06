package com.company;

public  class Boss extends GameEntity {

    private Weapon katana;

    public Weapon getKatana() {
        return katana;
    }

    public void setKatana(Weapon katana) {
        this.katana = katana;
    }

    public String printInfo() {
        return super.info() + " " + getKatana().getTip() + " " + getKatana().getName();


    }

}





