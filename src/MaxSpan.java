
import java.util.Scanner;

public class MaxSpan {

    private static int slotHeight = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //below is a tic-tac-toe game
        
        String res;

        do {
            System.out.println("C for continue");
            System.out.println("Q for quit");
            System.out.println("Choose.");

            res = in.next();

            switch (res.charAt(0)) {
                case 'c':
                case 'C':
                    String[][] ticTac
                            = {{"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                            {"|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|"},
                            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                            {"|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|"},
                            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                            {"|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|"},
                            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}
                            };
                    int spaces = 9;
                    while (spaces >= 0) {
                        if (spaces == 9 || spaces == 7 || spaces == 5 || spaces == 3 || spaces == 1) {
                            System.out.println("Player X, enter the row index of your square (1, 3, or 5).");
                            int rowIndex = in.nextInt();
                            if (rowIndex != 1 && rowIndex != 3 && rowIndex != 5) {
                                System.out.println("You entered an invalid row index. Try again.");
                                break;
                            }
                            System.out.println("Enter the column index of your square (2, 6, or 10).");
                            int columnIndex = in.nextInt();
                            if (columnIndex != 2 && columnIndex != 6 && columnIndex != 10) {
                                System.out.println("You entered an invalid column index. Try again.");
                                break;

                            }
                            ticTac[rowIndex][columnIndex] = "X";

                            for (int i = 0; i < ticTac.length; i++) {
                                for (int j = 0; j < ticTac[i].length; j++) {
                                    System.out.print(ticTac[i][j]);
                                }
                                System.out.println();
                            }
                        } else {
                            System.out.println("Player O, enter the row index of your square (1, 3, or 5).");
                            int rowIndex = in.nextInt();
                            if (rowIndex != 1 && rowIndex != 3 && rowIndex != 5) {
                                System.out.println("You entered an invalid row index. Try again.");
                                break;
                            }
                            System.out.println("Enter the column index of your square (2, 6, or 10).");
                            int columnIndex = in.nextInt();
                            if (columnIndex != 2 && columnIndex != 6 && columnIndex != 10) {
                                System.out.println("You entered an invalid column index. Try again.");
                                break;

                            }
                            if (ticTac[rowIndex][columnIndex] == "O" || ticTac[rowIndex][columnIndex] == "X") {
                                System.out.println("Someone already has a tac in that spot.");
                            }
                            ticTac[rowIndex][columnIndex] = "O";

                            for (int i = 0; i < ticTac.length; i++) {
                                for (int j = 0; j < ticTac[i].length; j++) {
                                    System.out.print(ticTac[i][j]);
                                }
                                System.out.println();
                            }
                        }
                        spaces--;
                    }
                    for (int i = 0; i < ticTac.length; i++) {
                        for (int j = 0; j < ticTac[i].length; j++) {
                            System.out.print(ticTac[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 'q':
                case 'Q':
                    break;
                default:
                    System.out.println("Invalid. Please try again.");
            }
        } while (res.charAt(0) != 'q' && res.charAt(0) != 'Q');
    }
}
