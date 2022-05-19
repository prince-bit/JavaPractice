import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int reversed = 0;

        for(; num != 0; num /= 10){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println(reversed);
    }
  }