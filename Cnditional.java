import java.util.Scanner;

public class Cnditional {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a, b;
        a = s.nextInt();
        b = s.nextInt();

        if(a > b){
            System.out.println("First num is greater");

        }
        else{
            System.out.println("Second num is greater");
        }

        System.out.println("Outside if else");

    }
    
}
// In else condition there cant gbe any operators.