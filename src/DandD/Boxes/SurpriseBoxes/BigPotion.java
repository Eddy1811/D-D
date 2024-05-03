package DandD.Boxes.SurpriseBoxes;
import DandD.Hero.Character;

public class BigPotion extends SurpriseBox{
    public BigPotion(){
        super("une grande Potion", 5);
    }

    @Override
    public String toString() {
        return "une " + name +
                ", effet = +" + effect +
                "points de vie";
    }

    @Override
    public void interaction(Character character) {
        String type = character.getType();

    }

}
