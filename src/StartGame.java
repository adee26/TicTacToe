import java.util.Scanner;

public class StartGame {
    public static void startGame(){
        System.out.println("Welcome to Tic-Tac-Toe! ");
        System.out.println("Do you want to see the rules? Y/N ");
        Scanner scanner = new Scanner(System.in);
        char decision = scanner.next().charAt(0);
        if(decision =='Y'){
            System.out.println("1. The game is played by two players.");
            System.out.println("2. The first player starts with 'X' and the second player plays with 'O' ");
            System.out.println("3. You will have to replace one of the numbers with 'X'/'O' ");
            System.out.println("4. The first player to get 3 X's or 3 O's in a row wins.");
        }else{
            System.out.println("Good luck!");
        }
    }
}
