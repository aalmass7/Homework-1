package com.narxoz.rpg.equipment;

public class ArcaneStaff implements Weapon{
    public int getDamage(){
        return 15;
    }
    public String getWeaponInfo(){
        return "Arcane Staff (Damage: 15, Mana Boost: 20)";
    }
}
