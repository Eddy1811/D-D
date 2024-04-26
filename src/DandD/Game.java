package DandD;

import java.util.concurrent.ThreadLocalRandom;


public class Game {

    // Constructeur  EN DESSOUS ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    private Menu menu;
    private Character character;

    public Game(Menu menu) {
        this.menu = new Menu();
    }

    public void setCharacter(String name, String type) {
        this.character = new Character(name, type);
    }

    public Character start(String name, String type) {
        character = new Character(name, type);
        Box[] board = this.initializeBoard(64);
        menu.startMenu(character);
        return character;
    }


    public Box[] initializeBoard(int size) {
        Box[] board = new Box[size];
        for (int i = 0; i < size; i++) {
            board[i] = new Box(i);
        }
        return board;
    }


    public void play(int Position) {

        return;
    }


    public int position(int Position) {
        int dice = rollDice();
        return Position + dice;
    }


    public int rollDice() {
        return ThreadLocalRandom.current().nextInt(1, 6);
    }

}
