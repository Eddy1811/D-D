package DandD.Boxes.SurpriseBoxes;
import DandD.Hero.Character;

public class Sword extends SurpriseBox {
    public Sword() {
        super("Épée", 5);
    }

    @Override
    public String toString() {
        return "une" + name +
                ", effet = +" + effect +
                " de force !";
    }


    @Override
    public void interaction(Character character) {

    }
}
