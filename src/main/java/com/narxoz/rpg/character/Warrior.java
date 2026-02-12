package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.EquipmentFactory;

public class Warrior implements Character {

    private final String name;
    private final int health = 150;
    private final int mana = 30;
    private final int strength = 80;
    private final int intelligence = 20;

    private Weapon weapon;
    private Armor armor;

    public Warrior(String name) {
        this.name = name;
    }

    @Override public String getName() { return name; }
    @Override public int getHealth() { return health; }
    @Override public int getMana() { return mana; }
    @Override public int getStrength() { return strength; }
    @Override public int getIntelligence() { return intelligence; }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Warrior) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses BERSERKER RAGE! Strength temporarily increased!");
    }

    @Override public void equipWeapon(Weapon weapon) { this.weapon = weapon; }
    @Override public void equipArmor(Armor armor) { this.armor = armor; }

    @Override public Weapon getEquippedWeapon() { return weapon; }
    @Override public Armor getEquippedArmor() { return armor; }

    @Override
    public void equipSet(EquipmentFactory factory) {
        this.weapon = factory.createWeapon();
        this.armor = factory.createArmor();
    }

    @Override
    public void displayEquipment() {
        if (weapon != null) System.out.println("Weapon: " + weapon.getWeaponInfo());
        if (armor != null) System.out.println("Armor: " + armor.getArmorInfo());
    }
}
