package com.narxoz.rpg.equipment;

public class MysticRobe implements Armor{

    public int getDefense(){
        return 10;
    }

    public String getArmorInfo(){
        return "Mystic Robe (Defense: 10, Mana Boost: 25 )";
    }

    public String getArmorType() {
        return "Robe";
    }
}
