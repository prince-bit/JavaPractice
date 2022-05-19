import java.util.Scanner;

public class BinarytToDecimal {
    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          int n = s.nextInt();

          
          int decimal = 0, power = 0;

          while(n != 0){
              
              decimal += ((n % 10) * Math.pow(2, power));
              power++;
              n = n / 10;
              
          }
          System.out.println(decimal);
    }
}
