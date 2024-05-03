package DandD;

import DandD.Hero.Character;

import java.util.Scanner;

public class Menu {


    // Constructeur  EN DESSOUS ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    Main main = new Main();
    Game game = new Game();

    public Menu() {
    }


    public boolean gameOrNot() {
        Scanner input = new Scanner(System.in);
        System.out.println("Voulez-vous jouer ?");
        System.out.println("    1- Jouer     2- Quitter");
        String choice = input.nextLine();
        if (choice.equals("1")) {
            return true;
        } else {
            this.Quit();
            return false;
        }
    }


    public String chooseType() {
        Scanner entryOfPlayer = new Scanner(System.in);
        System.out.println("Quels types de personnages voulez-vous jouer?");
        System.out.println("   1 - Guerrier        2 - Magicien     9 - Quitter");
        String choice = entryOfPlayer.nextLine();
        if (choice.equals("1")) {
            return "Warrior";
        } else if (choice.equals("2")) {
            return "Wizard";
        } else {
            this.Quit();
            return "";
        }
    }


    public String chooseName() {
        Scanner inputName = new Scanner(System.in);
        System.out.println("Quel est votre nom?");
        return inputName.nextLine();
    }

    public boolean isSure() {
        Scanner input = new Scanner(System.in);
        System.out.println("Êtes-vous sur de lancer avec ces informations ?");
        System.out.println("    1 - Oui     2 - Non     9 - Quitter");
        String choice = input.nextLine();

        if (choice.equals("1")) {
            return true;
        } else if (choice.equals("2")) {
            return false;
        } else {
            this.Quit();
            return false;
        }
    }


    public void startMenu(Character character) {
        if (character.getType() == "Warrior") {
            System.out.println("Vous êtes " + character.getName() + ", le plus grand Guerrier de tous les temps !");
        } else {
            System.out.println("Vous êtes " + character.getName() + ", le plus grand Magicien de tous les temps !");
        }
        System.out.println("Points de vie : " + character.getLifePoints());
        System.out.println("Puissance d'attaque : " + character.getStrength());

        System.out.println("Bienvenue dans le jeu Donjons et Dragons !");
        System.out.println("Vous êtes à la case départ");
        System.out.println("Appuyer sur entrée pour jouer");
    }


    public void showTurn(int dice, int newPosition) {
        System.out.println("Vous avez fais un " + dice);
        System.out.println("Case " + newPosition + "/64");
    }


    public void loseGame() {
        System.out.println("⡴⠒⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠉⠳⡆⠀\n" +
                "⣇⠰⠉⢙⡄⠀⠀⣴⠖⢦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣆⠁⠙⡆\n" +
                "⠘⡇⢠⠞⠉⠙⣾⠃⢀⡼⠀⠀⠀⠀⠀⠀⠀⢀⣼⡀⠄⢷⣄⣀⠀⠀⠀⠀⠀⠀⠀⠰⠒⠲⡄⠀⣏⣆⣀⡍\n" +
                "⠀⢠⡏⠀⡤⠒⠃⠀⡜⠀⠀⠀⠀⠀⢀⣴⠾⠛⡁⠀⠀⢀⣈⡉⠙⠳⣤⡀⠀⠀⠀⠘⣆⠀⣇⡼⢋⠀⠀⢱\n" +
                "⠀⠘⣇⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⡴⢋⡣⠊⡩⠋⠀⠀⠀⠣⡉⠲⣄⠀⠙⢆⠀⠀⠀⣸⠀⢉⠀⢀⠿⠀⢸\n" +
                "⠀⠀⠸⡄⠀⠈⢳⣄⡇⠀⠀⢀⡞⠀⠈⠀⢀⣴⣾⣿⣿⣿⣿⣦⡀⠀⠀⠀⠈⢧⠀⠀⢳⣰⠁⠀⠀⠀⣠⠃\n" +
                "⠀⠀⠀⠘⢄⣀⣸⠃⠀⠀⠀⡸⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠈⣇⠀⠀⠙⢄⣀⠤⠚⠁⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⢹⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀⠀⢘⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⢰⣿⣿⣿⡿⠛⠁⠀⠉⠛⢿⣿⣿⣿⣧⠀⠀⣼⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡀⣸⣿⣿⠟⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⡀⢀⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡇⠹⠿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⡿⠁⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣤⣞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢢⣀⣠⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠲⢤⣀⣀⠀⢀⣀⣀⠤⠒⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("VOUS AVEZ PERDU !");
        this.restart();
    }


    public void winGame() {
        System.out.println("__   __ _      _\n" +
                "\\ \\ / /(_) __ | |_  ___  _ _  _  _\n" +
                " \\ V / | |/ _||  _|/ _ \\| '_|| || |\n" +
                "  \\_/  |_|\\__| \\__|\\___/|_|   \\_, |\n" +
                "                              |__/");
        System.out.println("Félicitations !!! Vous êtes sorti victorieux du labyrinthe de Donjons et Dragons !");
        this.restart();
    }

    public void restart() {
        System.out.println("Voulez-vous rejouer ?");
        System.out.println("    1 - Rejouer     2- Quitter");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        if (choice.equals("1")) {
            game.start();
        } else {
            this.Quit();
        }
    }


    public void Quit() {
        System.out.println("ε(´｡•᎑•`)っ \uD83D\uDC95");
        System.exit(0);
    }
}
