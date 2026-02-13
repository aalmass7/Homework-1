package com.narxoz.rpg.equipment;

public class RangerEquipmentFactory implements EquipmentFactory{

    public Weapon createWeapon(){
        return new HunterBow();
    }

    public Armor createArmor(){
        return new ScoutLeather();
    }

    public String getThemeName(){
        return "Ranger";
    }
}
