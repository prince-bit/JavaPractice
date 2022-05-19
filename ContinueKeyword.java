public class ContinueKeyword {
    public static void main(String[] args) {
        int i = 1;
        while(i < 3) {
            int j = 0;
            while(j < 5) {
                j++;
                if(j == 3) {
                    continue;
                }
                System.out.print(j + " ");
            }
            i++;
        }

        // int n = 5;
        // for(int i = 1; i <= n; i++){
        //     if(i == 4){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // int i = 1;
        // int n = 5;
        // while(i <= n){
        //     //i++;
        //     if(i == 4){
        //         i++;
        //         continue;
        //     }
        //     i++;
        //     System.out.println(i);
        // }
    }
}
// Continue statement is often used inside in programming languages inside loops control structures.
//  Inside the loop, when a continue statement is encountered the control directly jumps to the beginning of the loop for the next iteration instead of executing the statements of the current iteration.
