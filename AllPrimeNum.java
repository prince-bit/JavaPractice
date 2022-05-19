import java.util.Scanner;

public class AllPrimeNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        

        for(int i = 2; i <= n; i++){
            int isPrime;
            isPrime = 0;
            
            for(int j = 2; j <= i/2; j++){
                if(i % j == 0){
                    isPrime = 1;
                    break;
                }
            }
            if(isPrime == 0 && n != 1)
            System.out.println(i+"");
        }
    
        return;
    }
}