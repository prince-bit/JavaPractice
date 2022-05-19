import java.io.*;
import java.util.Scanner;
 
class practice11
{  
    
    public static void main(String arg[])
    {  
        
        Scanner s = new Scanner(System.in);
    	int n;
        n = s.nextInt();
         
        
        int range = 10;
         
        for (int i = 1; i <= range; i++)
            System.out.println(n * i);
    }
}
