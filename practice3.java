import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        // int i=0;
        // while(i<10)
        // {
        //     i=i+1;
        //     System.out.print(i);
        //     i=i+1;
        // }

        // int x=5;
        // int y=5;
        // while((x=5)==y)
        // {
        //     System.out.println("Hello");
        //     x++;
        //     y++;
        // }
    //     int x=5;
    // int y=5;
    // while(x==y)
    // {
    //     System.out.println("Hello");
    //     x++;
    //     y++;
    // }

    // Scanner s=new Scanner (System.in);
    // int n=s.nextInt();
    // boolean isprime=true;
    // if(n%2==0)
    //     isprime=false;
    // int i=3;
    // while(isprime&&i<n)
    // {
    //     isprime=!(n%i==0);
    //     i+=2;
    // }
    // if(isprime)
    // {
    //     System.out.println("Prime");
    // }
    // else
    // {
    //     System.out.println("Composite");
    // }
    int i=10;
    while((i=i-1)>0)
    {
        System.out.print(i);
        if(i%5==0)
            return;
    }

     }
    
}
