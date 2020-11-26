package com.company;

public class Main {

    public static void main(String[] args) {

        Boss Boss = new Boss();
        Boss.setName("Thanos:");   //Имя Босса
        Boss.setAttack(500);       //Урон Босса
        Boss.setHealth(2500);      // Жизнь Босса


        Weapon weapon = new Weapon();
        weapon.setWeaponType("Gauntlet"); // Тип оружия
        weapon.setWeaponName("The Infinity Gauntlet"); // Имя оружия

        Boss.setWeapon(weapon);
        System.out.println(Boss.getName()
                + " " + Boss.getAttack()
                + " " + Boss.getHealth()
                + " " + Boss.getWeapon().getWeaponType()
                + " " + Boss.getWeapon().getWeaponName());

    }
}
