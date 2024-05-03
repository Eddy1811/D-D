package DandD.Exception;

public class OutOfBoardException extends Exception {
    public OutOfBoardException(){
        System.out.println("Vous atterissez sur une case qui n'existe pas dans le plateau ! Veuillez rejouer");
    }
}
