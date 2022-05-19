public class BitwiseOperator {
    public static void main(String[] args) {
        
        int x = 10;
        int y = 20;
        if(x++ > 10 || ++y > 20 ){
       System.out.print("Inside if  ");
        }else{
       System.out.print("Inside else  ");
        }
        System.out.println(x  + " " + y);
        
        
        // int a = 10;
        // int b = 2;


        

        // // int c = a & b;
        
        // System.out.println(a & b);
        // System.out.println(a | b);
        // System.out.println(a ^ b);
        // System.out.println(~a);
        // System.out.println(a << 3); 
        // System.out.println(a >> 1);
    }
}
// in right shift we will fill the vacant space with sign bit(maybe 0 or 1)