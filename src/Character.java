public class Character {

    private String name;
    private String type;
    private int lifePoints;
    private int strength;
    private int offensiveEquipment;
    private int defensiveEquipment;

    // Constructeur  EN DESSOUS ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓


    Character() {

    }


    Character(String name) {
        this.name = name;
    }


    Character(String name, String type) {
        this.name = name;
        this.type = type;
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

    public int getOffensiveEquipment() {
        return offensiveEquipment;
    }

    public int getDefensiveEquipment() {
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

    public void setOffensiveEquipment(int offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
    }

    public void setDefensiveEquipment(int defensiveEquipment) {
        this.defensiveEquipment = defensiveEquipment;
    }
}
