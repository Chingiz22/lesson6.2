package com.company;

public class Main {

    public static void main(String[] args) {

        GameEntity GameEntity = new GameEntity();
        GameEntity.setName("Thanos:");   //Имя Босса
        GameEntity.setAttack(500);       //Урон Босса
        GameEntity.setHealth(2500);      // Жизнь Босса

        System.out.println(GameEntity.getName()
                + " " + GameEntity.getAttack()
                + " " + GameEntity.getHealth());

        Weapon weapon = new Weapon();
        weapon.setWeaponType("Gauntlet"); // Тип оружия
        weapon.setWeaponName("The Infinity Gauntlet"); // Имя оружия

        Boss Boss = new Boss();
        Boss.setWeaponName("The Infinity Gauntlet");
        System.out.println("Boss weapon:" + " " + Boss.getWeaponName());

    }
}
