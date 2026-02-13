package com.narxoz.rpg.equipment;

public class MedievalEquipmentFactory implements EquipmentFactory{

    public Weapon createWeapon(){
        return new KnightBlade();
    }
    public Armor createArmor(){
        return new KnightPlate();
    }
    public String getThemeName(){
        return "Medieval";
    }
}
