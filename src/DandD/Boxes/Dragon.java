package DandD.Boxes;

import DandD.Hero.Character;

public class Dragon extends Ennemy implements Box {
    public Dragon(){
        super("Dragon", 4,15);
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
        System.out.println("JE SUIS UN DRAGON");

    }

}
