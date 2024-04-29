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
            Game game = new Game(menu);
            game.start();
        }
    }
}