package DandD.Hero;

public class Wizard extends Character {


    public Wizard(String name) {
        super(name);
        this.setType("Wizard");
        this.setLifePoints(6);
        this.setStrength(15);
    }


    @Override
    public String toString() {
        return "Magicien : " +
                "Nom = " + name +
                ", Points de vie = " + lifePoints +
                ", Force = " + strength
                ;
    }
}
