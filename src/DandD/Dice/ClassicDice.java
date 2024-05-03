package DandD.Dice;

import java.util.concurrent.ThreadLocalRandom;


public class ClassicDice implements Dice {
    @Override
    public int rollDice() {
        return  ThreadLocalRandom.current().nextInt(1, 7);
    }
}
