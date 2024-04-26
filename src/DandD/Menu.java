package DandD;

import java.util.Scanner;

public class Menu {


    // Constructeur  EN DESSOUS ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    public Menu() {
    }


    public boolean gameOrNot() {
        Scanner input = new Scanner(System.in);
        System.out.println("Voulez-vous jouer ?");
        System.out.println("    1- Jouer     2- Quitter");
        String choice = input.nextLine();
        if (choice.equals("1")) {
            return true;
        }
        else{
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
            return "Guerrier";
        } else if (choice.equals("2")) {
            return "Magicien";
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

    public String Sure() {
        Scanner input = new Scanner(System.in);
        System.out.println("Êtes-vous sur de lancer avec ces informations ?");
        System.out.println("    1 - Oui     2 - Non     9 - Quitter");
        String choice = input.nextLine();
        if (choice.equals("1")) {
            return "Oui";
        } else if (choice.equals("2")) {
            return "Non";
        } else {
            this.Quit();
            return "";
        }
    }

    public void startMenu(Character character){
        System.out.println("Vous êtes "+character.getName()+", le plus grand "+character.getType()+" de tous les temps !");
        System.out.println("Bienvenue dans le jeu Donjons et Dragons !");
        System.out.println("Vous êtes à la case départ");
        System.out.println("Appuyer sur entrée pour jouer");
    }

    public void Quit() {
        System.out.println("ε(´｡•᎑•`)っ \uD83D\uDC95");
        System.exit(0);
    }


}
