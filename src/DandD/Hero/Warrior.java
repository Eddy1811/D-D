package DandD.Hero;

import java.time.chrono.ChronoZonedDateTime;

public class Warrior extends Character {


    public Warrior(String name) {
        super(name);
        this.setType("Warrior");
        this.setLifePoints(10);
        this.setStrength(10);
    }


    @Override
    public String toString() {
        return "Guerrier : " +
                "Nom = " + this.name +
                ", Type = " + this.type +
                ", Force = " + this.strength
                ;
    }
}
