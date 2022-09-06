package com.company;

public class GameEntity {

    private int HP;
    private int DM;


    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDM() {
        return DM;
    }

    public void setDM(int DM) {
        this.DM = DM;
    }

public String info(){
        return (getHP()+ " " + getDM());
}
}
