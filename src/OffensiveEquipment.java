public class OffensiveEquipment {
    public static void main(String[] args) {
    }

    private String type;
    private String name;
    private int attackLevel;

// Constructeur  EN DESSOUS ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    public OffensiveEquipment(String type) {
        this.type = type;
    }


// GETTER  EN DESSOUS ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAttackLevel() {
        return attackLevel;
    }



}
