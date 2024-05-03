package DandD.Boxes.SurpriseBoxes;
import DandD.Boxes.Box;
import DandD.Hero.Character;

public abstract class SurpriseBox implements Box{
    String name;
    int effect;
    SurpriseBox(String name,int effect){

    }

    public abstract void interaction(Character character);
}
