package com.narxoz.rpg.equipment;

public class MagicEquipmentFactory implements EquipmentFactory{

    public Weapon createWeapon(){
        return new ArcaneStaff();
    }
    public Armor createArmor(){
        return new MysticRobe();
    }

    public String getThemeName(){
        return "Magic";
    }
}
