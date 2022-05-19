import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int r = 0, p = 0;
        while(n > 0){
            int a = n % 2;
            r = r + a * (int)Math.pow(10, p++);
            n = n / 2;
        }
        System.out.println(r);
    }
}
