package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.EquipmentFactory;

public class Archer implements Character {

    private String name;
    private int health = 100;
    private int mana = 70;
    private int strength = 55;
    private int intelligence = 55;

    private Weapon weapon;
    private Armor armor;

    public Archer(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getMana(){
        return mana;
    }
    public int getStrength(){
        return strength;
    }
    public int getIntelligence(){
        return intelligence;
    }
    public void displayStats(){
        System.out.println("=== " + name + " (Archer) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }
    public void useSpecialAbility(){
        System.out.println(name + " uses EAGLE EYE!");
    }
    public void equipWeapon(Weapon weapon){ this.weapon = weapon; }
    public void equipArmor(Armor armor){ this.armor = armor; }

    public Weapon getEquippedWeapon(){ return weapon; }
    public Armor getEquippedArmor(){ return armor; }

    public void equipSet(EquipmentFactory factory){
        weapon = factory.createWeapon();
        armor = factory.createArmor();
    }
    public void displayEquipment(){
        if(weapon!=null){
            System.out.println("Weapon: " + weapon.getWeaponInfo());
        }
        if(armor!=null){
            System.out.println("Armor: " + armor.getArmorInfo());
        }
    }

}
