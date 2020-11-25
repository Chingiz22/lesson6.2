package com.company;

public class Main {

    public static void main(String[] args) {

        GameEntity GameEntity = new GameEntity();
        GameEntity.setBoss("Thanos");
        GameEntity.setBossAttack(500);
        GameEntity.setBossHealth(2500);
        GameEntity.setHero("Thor");
        GameEntity.setHeroAttack(450);
        GameEntity.setHeroHealth(1500);

        System.out.println(GameEntity.getBoss()
                + " " + GameEntity.getBossAttack()
                + " " + GameEntity.getBossHealth());

        System.out.println(GameEntity.getHero()
                + " " + GameEntity.getHeroAttack()
                + " " + GameEntity.getHeroHealth());

        Weapon weapon = new Weapon();
        weapon.setWeaponType("Gun");
        weapon.setWeaponName("Ak-47");

        Boss Boss = new Boss();
        Boss.setWeapon("Ak-47");
        System.out.println("Boss weapon" + " " + Boss.getWeapon());


    }
}
