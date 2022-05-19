import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 1; i<= n; i++){
            int sum = 3 * i + 2;
            if(sum % 4 == 0){
                int a = 1;
                n = n + a;
                continue;
            }
            System.out.print(sum+" ");
        }
    }
}
