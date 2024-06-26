package DandD.Hero;

import DandD.Equipment.DefensiveEquipment;
import DandD.Equipment.OffensiveEquipment;

import java.util.Objects;

public abstract class Character {

    protected String name;
    protected String type;
    protected int lifePoints;
    protected int strength;
    protected OffensiveEquipment offensiveEquipment;
    protected DefensiveEquipment defensiveEquipment;

    // Constructeur  EN DESSOUS ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓


    public Character() {

    }


    Character(String name) {
        this.name = name;
    }


    Character(String name, String type, int lifePoints, int strength) {
        this.name = name;
        this.type = type;
        this.lifePoints = lifePoints;
        this.strength = strength;
    }

// GETTER  EN DESSOUS ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public int getStrength() {
        return strength;
    }

    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
    }

    public DefensiveEquipment getDefensiveEquipment() {
        return defensiveEquipment;
    }


    // SETTER en dessous ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓


    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
    }

    public void setDefensiveEquipment(DefensiveEquipment defensiveEquipment) {
        this.defensiveEquipment = defensiveEquipment;
    }


    // To STRING en dessous ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓


    @Override
    public String toString() {
        return "DandD.Hero.Character{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", lifePoints=" + lifePoints +
                ", strength=" + strength +
                ", offensiveEquipment=" + offensiveEquipment +
                ", defensiveEquipment=" + defensiveEquipment +
                '}';
    }

    // Equals - Hashcode en dessous ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return lifePoints == character.lifePoints && strength == character.strength && Objects.equals(name, character.name) && Objects.equals(type, character.type) && Objects.equals(offensiveEquipment, character.offensiveEquipment) && Objects.equals(defensiveEquipment, character.defensiveEquipment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, lifePoints, strength, offensiveEquipment, defensiveEquipment);
    }
}

