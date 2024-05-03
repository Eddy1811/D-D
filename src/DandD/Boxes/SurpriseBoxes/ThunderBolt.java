package DandD.Boxes.SurpriseBoxes;
import DandD.Hero.Character;

public class ThunderBolt extends SurpriseBox {
    public ThunderBolt() {
        super("Éclair pourfendeur", 2);
    }

    @Override
    public String toString() {
        return "l'" + name +
                ", effet = +" + effect +
                " de puissance !";
    }


    @Override
    public void interaction(Character character) {

    }
}
