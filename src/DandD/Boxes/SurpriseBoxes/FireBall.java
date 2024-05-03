package DandD.Boxes.SurpriseBoxes;

import DandD.Hero.Character;

public class FireBall extends SurpriseBox {
    public FireBall() {
        super("Méga boule de feu", 7);
    }

    @Override
    public String toString() {
        return "la" + name +
                ", effet = +" + effect +
                " de puissance !";
    }


    @Override
    public void interaction(Character character) {

    }

}
