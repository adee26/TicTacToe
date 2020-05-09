import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[] table = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

        Scanner scanner = new Scanner(System.in);
        StartGame.startGame();
        System.out.println("Introduce the name of the first player: ");
        String firstPlayer = scanner.nextLine();
        System.out.println("Introduce the name of the second player: ");
        String secondPlayer = scanner.nextLine();
        TicTacToe.showTable(table);

        int initialCounter = 1;
        int finalCounter = 1;
        int winners = 0;
        System.out.println(firstPlayer + "' s turn. Choose wisely: ");
        do {
            char choice = scanner.next().charAt(0);
            for (int i = 0; i < table.length; i++) {
                if (table[i] == choice && initialCounter % 2 != 0) {
                    table[i] = 'X';
                    initialCounter++;
                    break;
                } else if (table[i] == choice && initialCounter % 2 == 0) {
                    table[i] = 'O';
                    initialCounter++;
                    break;
                }
            }

            if (initialCounter == finalCounter) {
                System.out.println("Invalid choice. Choose another option. ");
            } else {
                finalCounter++;
            }

            showTable(table);

            if (table[0] == table[1] && table[1] == table[2]) {
                winners++;
                if (table[0] == 'X') {
                    System.out.println(firstPlayer + " won. Congratulations! Thanks for playing!");
                } else {
                    System.out.println(secondPlayer + " won. Congratulations! Thanks for playing!");
                }
            } else if (table[3] == table[4] && table[4] == table[5]) {
                winners++;
                if (table[3] == 'X') {
                    System.out.println(firstPlayer + " won. Congratulations! Thanks for playing!");
                } else {
                    System.out.println(secondPlayer + " won. Congratulations! Thanks for playing!");
                }
            } else if (table[6] == table[7] && table[7] == table[8]) {
                winners++;
                if (table[6] == 'X') {
                    System.out.println(firstPlayer + " won. Congratulations! Thanks for playing!");
                } else {
                    System.out.println(secondPlayer + " won. Congratulations! Thanks for playing!");
                }
            } else if (table[0] == table[3] && table[3] == table[6]) {
                winners++;
                if (table[6] == 'X') {
                    System.out.println(firstPlayer + " won. Congratulations! Thanks for playing!");
                } else {
                    System.out.println(secondPlayer + " won. Congratulations! Thanks for playing!");
                }
            } else if (table[1] == table[4] && table[4] == table[7]) {
                winners++;
                if (table[1] == 'X') {
                    System.out.println(firstPlayer + " won. Congratulations! Thanks for playing!");
                } else {
                    System.out.println(secondPlayer + " won. Congratulations! Thanks for playing!");
                }
            } else if (table[2] == table[5] && table[5] == table[8]) {
                winners++;
                if (table[2] == 'X') {
                    System.out.println(firstPlayer + " won. Congratulations! Thanks for playing!");
                } else {
                    System.out.println(secondPlayer + " won. Congratulations! Thanks for playing!");
                }
            } else if (table[0] == table[4] && table[4] == table[8]) {
                winners++;
                if (table[0] == 'X') {
                    System.out.println(firstPlayer + " won. Congratulations! Thanks for playing!");
                } else {
                    System.out.println(secondPlayer + " won. Congratulations! Thanks for playing!");
                }
            } else if (table[2] == table[4] && table[4] == table[6]) {
                winners++;
                if (table[2] == 'X') {
                    System.out.println(firstPlayer + " won. Congratulations! Thanks for playing!");
                } else {
                    System.out.println(secondPlayer + " won. Congratulations! Thanks for playing!");
                }

            }

            if (winners == 0) {
                if (initialCounter % 2 != 0) {
                    System.out.println("\n ====================================");
                    System.out.println(firstPlayer + "'s turn: ");
                } else {
                    System.out.println("\n ====================================");
                    System.out.println(secondPlayer + "'s turn: ");
                }
            }
        } while (initialCounter < 9 && winners == 0);


        if (winners == 0) {
            System.out.println("Draw. Both players are equally good.");
        }


    }


    public static void showTable(char[] table) {
        System.out.println(" _________________");
        System.out.println("| " + table[0] + "   |  " + table[1] + "  |   " + table[2] + " |");
        System.out.println("|_____|_____|_____|");
        System.out.println("| " + table[3] + "   |  " + table[4] + "  |   " + table[5] + " |");
        System.out.println("|_____|_____|_____|");
        System.out.println("| " + table[6] + "   |  " + table[7] + "  |   " + table[8] + " |");
        System.out.println("|_____|_____|_____|");
    }


}
