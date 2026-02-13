package com.narxoz.rpg;

import com.narxoz.rpg.character.*;
import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.*;
import com.narxoz.rpg.equipment.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");

        CharacterFactory warriorFactory = new WarriorFactory();
        Character warrior = warriorFactory.createCharacter("Thor");

        CharacterFactory mageFactory = new MageFactory();
        Character mage = mageFactory.createCharacter("Merlin");

        CharacterFactory archerFactory = new ArcherFactory();
        Character archer = archerFactory.createCharacter("Robin");

        EquipmentFactory medieval = new MedievalEquipmentFactory();
        EquipmentFactory magic = new MagicEquipmentFactory();
        EquipmentFactory ranger = new RangerEquipmentFactory();

        warrior.equipSet(medieval);
        mage.equipSet(magic);
        archer.equipSet(ranger);

        warrior.displayStats();
        warrior.useSpecialAbility();
        warrior.displayEquipment();

        System.out.println();

        mage.displayStats();
        mage.useSpecialAbility();
        mage.displayEquipment();

        System.out.println();

        archer.displayStats();
        archer.useSpecialAbility();
        archer.displayEquipment();

        System.out.println("\n=== Demo Complete ===");
    }
}
