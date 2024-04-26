package DandD;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Main launch = new Main();
        launch.launchGame();
        // quit
    }


    public void launchGame() {
        Menu menu = new Menu();
        if (menu.gameOrNot()) {
            String type = menu.chooseType();
            String name = menu.chooseName();
            String sure = menu.Sure();
            if (sure.equals("Oui")) {
                Game game = new Game(menu);
                game.setCharacter(name, type);
                game.start(name, type);
            } else if (sure.equals("Non")) {
                this.launchGame();
            }
        }
    }
}