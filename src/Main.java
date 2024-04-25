//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        if (menu.gameOrNot()) {
            String result = menu.chooseType();
            String name = menu.chooseName();
            System.out.println("Vous êtes "+name+ ", le "+result);
        } else{
            System.out.println("Pas de jeu donc :'(");
        }
        // quit
    }
}