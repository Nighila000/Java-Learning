import java.util.Scanner;
public class xox{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] board = new String[3][3];
        boolean gameRunning = true;
        String player;
        String playAgain;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = " ";
            }
        }
        do {
            do {
                System.out.print("Enter the choice (X or O): ");
                player = sc.nextLine();

                if (!player.equals("X") && !player.equals("O")) {
                    System.out.println("INVALID CHOICE!");
                }
            } while (!player.equals("X") && !player.equals("O"));
            while (gameRunning) {
                if (player.equals("X") || player.equals("O")) {
                    System.out.print("In which row? ");
                    int row = sc.nextInt();
                    System.out.print("In which column? ");
                    int column = sc.nextInt();
                    sc.nextLine();
                    if ((row >= 3 )||(row < 0)||(column >= 3)||(column < 0)) {
                        System.out.println("Enter row and column between 0 and 2!");
                    } else {
                        if (!board[row][column].equals(" ")) {
                            System.out.println("POSITION IS OCCUPIED!");
                        } else {
                            board[row][column] = player;
                            if (player.equals("X")) {
                                player = "O";
                            } else {
                                player = "X";
                            }
                        }
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.print("|");
                                System.out.print(" ");
                                System.out.print(board[i][j] + " |");
                            }
                            System.out.println(" ");
                        }
                    }
                } else {
                    System.out.println("INVALID CHOICE!");

                }
                for (int i = 0; i < 3; i++) {
                    if (board[i][0].equals("X") && board[i][1].equals("X") && board[i][2].equals("X") ||
                            board[i][0].equals("O") && board[i][1].equals("O") && board[i][2].equals("O")) {
                        System.out.println("🎉🎉YOU WON🎉🎉");
                        gameRunning = false;
                    }
                }
                for (int j = 0; j < 3; j++) {
                    if (board[0][j].equals("X") && board[1][j].equals("X") && board[2][j].equals("X") ||
                            board[0][j].equals("O") && board[1][j].equals("O") && board[2][j].equals("O")) {
                        System.out.println("🎉🎉YOU WON🎉🎉");
                        gameRunning = false;
                    }
                }
                if (board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X") ||
                        board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O") ||
                        board[0][2].equals("O") && board[1][1].equals("O") && board[2][0].equals("O") ||
                        board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X")) {
                    System.out.println("🎉🎉YOU WON🎉🎉");
                    gameRunning = false;
                }
                int flag = 0;
                if (gameRunning) {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (board[i][j].equals(" ")) {
                                flag = 1;
                            }
                        }
                    }
                    if (flag == 0) {
                        System.out.println("Draw!");
                        gameRunning = false;
                    }
                }

            }
            System.out.print("Play Again (Yes/No): ");
            playAgain = sc.nextLine();
            gameRunning = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = " ";
                }
            }
        } while (playAgain.equals("Yes")) ;
    }
} 

