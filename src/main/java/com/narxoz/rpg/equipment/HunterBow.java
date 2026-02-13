package com.narxoz.rpg.equipment;

public class HunterBow implements Weapon{

    public int getDamage(){
        return 30;
    }

    public String getWeaponInfo(){
        return "Hunter Bow (Damage: 30, Long Range)";
    }
}
