package DandD;

import DandD.Boxes.Box;
import DandD.Boxes.Dragon;
import DandD.Dice.ClassicDice;
import DandD.Dice.Dice;
import DandD.Dice.OneDice;
import DandD.Exception.OutOfBoardException;
import DandD.Hero.Character;
import DandD.Hero.Warrior;
import DandD.Hero.Wizard;
import java.util.ArrayList;
import java.util.Scanner;


public class Game {

    // Constructeur  EN DESSOUS ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    private Menu menu;
    private Character character;
    private Dice dice;


    public Game() {
    }

    public Game(Menu menu) {
        this.menu = menu;
        this.dice = new OneDice();
    }

    public void chooseCharacter() {
        Menu menu = new Menu();
        String type = menu.chooseType();
        String name = menu.chooseName();

        if (type.equals("Warrior")) {
            this.character = new Warrior(name);
            character.setLifePoints(10);
            character.setStrength(10);
        } else if (type.equals("Wizard")) {
            this.character = new Wizard(name);
            character.setLifePoints(6);
            character.setStrength(15);
        }
    }

    public void start() {
        Menu menu = new Menu();
        chooseCharacter();
        if (!menu.isSure()) {
            start();
        }

        menu.startMenu(character);
        System.out.println(character);

        play(0);
    }


    public ArrayList<Box> initializeBoard(int size) {
        ArrayList<Box> board = new ArrayList();

        for (int i = 0; i < size; i++) {
            Dragon dragon = new Dragon();
            board.add(dragon);
        }
        return board;
    }


    public void play(int Position) {
        Menu menu = new Menu();
        ArrayList<Box> board = initializeBoard(4);

        while (Position < board.size()) {
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();

            if (choice.isEmpty()) {
                try {
                    Position = this.position(Position);
                    if (Position == board.size()) {
                        menu.winGame();
                    }
                } catch (OutOfBoardException e) {
                }
            }
           Box entities = board.get(Position);
           entities.interaction();

        }


    }


    public int position(int Position) throws OutOfBoardException {
        Menu menu = new Menu();
        int dice = this.dice.rollDice();
        int newPosition = Position + dice;
        if (newPosition > 64) {

        throw new OutOfBoardException();

        }
        System.out.println("Position = " + Position);
        menu.showTurn(dice, newPosition);
        return newPosition;
    }


}
