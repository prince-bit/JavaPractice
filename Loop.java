import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n;
        n = s.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
}
