import java.util.Scanner;

public class KKPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int row = 0; row <= 2*n; row++){
            int totalCol = row > n ? 2*n-row: row;

            int spaces = n -totalCol;
            for(int sp = 0; sp < spaces; sp++){
                System.out.print(" ");
            }
            for(int col = 0; col < totalCol; col++){
                System.out.print("* ");
            }
            System.out.println();
        }


        // for(int row = 1; row <=n; row++){
        //     for(int col = 1; col <= row; col++){
        //         System.out.print(col);
        //     }
        //     System.out.println();
        // }
    }
}
