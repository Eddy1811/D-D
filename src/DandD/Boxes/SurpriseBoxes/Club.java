package DandD.Boxes.SurpriseBoxes;
import DandD.Hero.Character;

public class Club extends SurpriseBox{
    public Club(){
        super("Massue",3);
    }

    @Override
    public String toString() {
        return "une" +name +
                ", effet = +" + effect +
                " de force !";
    }

    @Override
    public void interaction(Character character) {

    }
}
