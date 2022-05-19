import java.util.Scanner;

public class PatternPr4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
         
        int i = 0;
        while(i < n){
            int spaces = 1;
            while(spaces < n - i){
                System.out.print(' ');
                spaces = spaces + 1;
            }

            int num = 1;
            while (num <= i){
                System.out.print(num);
                num = num + 1; 
            }
            
            // int dec = 1;
            // while(dec < ){
            //     System.out.print(dec);
            //     dec = dec - 1;
            // }
            System.out.println();
            i = i+1;
        }
       
    }
}