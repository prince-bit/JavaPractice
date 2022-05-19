import java.util.Scanner;

public class SquareRootIntegral {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int product = 1;
        int i = 1;
        while(product <= n){
            i++;
            product = i*i;
        }
        i = i -1;
        System.out.println(i);
    }
}
