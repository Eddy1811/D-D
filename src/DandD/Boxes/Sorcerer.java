package DandD.Boxes;

import DandD.Hero.Character;

public class Sorcerer extends Ennemy implements Box{
    public Sorcerer(){
        super("Sorcier",2, 9);
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

