package com.company;

public class Main {
    public static void main(String[] args) {

      Boss boss = new Boss();
      boss.setHP(700);
      boss.setDM(50);
      boss.setKatana(new Weapon("M16","Katana"));
        System.out.println(boss.getHP() + " " + boss.getDM() + " " + boss.getKatana().getName()+ " " + boss.getKatana().getTip());
        System.out.println(boss.printInfo());


        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHP(100);
        skeleton1.setDM(13);
        skeleton1.setArrows(12);
        System.out.println(skeleton1.printInfo());





        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHP(140);
        skeleton2.setDM(20);
        skeleton2.setArrows(15);
        System.out.println(skeleton2.printInfo());

    }
}
