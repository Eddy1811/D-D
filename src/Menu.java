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
        return choice.equals("1");
    }


    public String chooseType() {
        Scanner entryOfPlayer = new Scanner(System.in);
        System.out.println("Quels types de personnages voulez-vous jouer?");
        System.out.println("   1- Guerrier        2-Magicien");
        String choice = entryOfPlayer.nextLine();
        if (choice.equals("1")) {
            return "Guerrier";
        } else {
            return "Magicien";
        }


    }

public String chooseName() {
    Scanner inputName = new Scanner(System.in);
    System.out.println("Quel est votre nom?");
    return inputName.nextLine();
}



public String Sure(){
        Scanner input = new Scanner(System.in);
        System.out.println("Êtes-vous sur de lancer avec ces informations ?");
        System.out.println("    1- Oui     2 - Non");
        String choice = input.nextLine();
        if (choice.equals("1")) {
            return "Oui";
        }
        else{
            return "Non";
        }

}


}
