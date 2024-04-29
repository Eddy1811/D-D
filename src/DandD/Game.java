package DandD;

import java.util.concurrent.ThreadLocalRandom;


public class Game {

    // Constructeur  EN DESSOUS ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    private Menu menu;
    private Character character;




    public Game(){
    }

    public Game(Menu menu) {
        this.menu = menu;
    }

    public void chooseCharacter() {

        String type = menu.chooseType();
        String name = menu.chooseName();

        this.character = new Character(name, type);
        if (type.equals("Guerrier")) {
            character.setLifePoints(10);
            character.setStrength(10);
        }
        else if (type.equals("Magicien")) {
            character.setLifePoints(6);
            character.setStrength(15);
        }
    }

    public void start() {
        chooseCharacter();
        if (!menu.isSure()) {
            start();
        }

        menu.startMenu(character);

        play(0);
    }


    public Box[] initializeBoard(int size) {
        Box[] board = new Box[size];
        for (int i = 0; i < size; i++) {
            board[i] = new Box(i);
        }
        return board;
    }


    public void play(int Position) {
    while(Position <= 64){
        Position += rollDice();
        System.out.println("Case "+Position+"/64");
    }
    menu.winGame();
    }


    public int position(int Position) {
        int dice = rollDice();
        return Position + dice;
    }


    public int rollDice() {
        return ThreadLocalRandom.current().nextInt(1, 6);
    }

}
