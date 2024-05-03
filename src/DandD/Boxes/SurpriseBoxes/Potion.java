package DandD.Boxes.SurpriseBoxes;
import DandD.Hero.Character;

public class Potion extends SurpriseBox{
    public Potion() {
        super("Potion Standard", 2);
    }

    @Override
    public String toString() {
        return  "une" + name +
                ", effet = +" + effect +
                "points de vie";
    }


    @Override
    public void interaction(Character character) {

    }
}
