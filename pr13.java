import java.util.Scanner;
public class pr13 {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
    int num;
        
	num = s.nextInt();

        System.out.println("Factors of " + num +  " are ");

        for(int i = 2; i < num; i++){
            if(num % i == 0)
              System.out.println(i + " ");

            
        }
    }
}
