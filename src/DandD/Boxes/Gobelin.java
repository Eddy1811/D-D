package DandD.Boxes;
import DandD.Hero.Character;

public class Gobelin extends Ennemy implements Box{
    public Gobelin(){
        super("Gobelin",1,6);
    }

    @Override
    public String toString() {
        return "un " + name +
                ", avec " + lifePoints +
                " points de vie et " + strength +
                " points de force";
    }


    @Override
    public void interaction(Character character) {

    }
}

