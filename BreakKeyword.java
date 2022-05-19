public class BreakKeyword {
    public static void main(String[] args) {

       
        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i + 1 == j){
                    // break;
                    return;
                }
                System.out.print(j +"");
            }
            System.out.println();
        }
        


        // while (i <= n) {
        //     if (i == 4) {
        //         // System.out.println(i);
        //         break;
        //     }
        //     System.out.println(i);
        //     i++;
        // }
        // for(int j = 1; j <= n; j++){
        //     if(j == 4){
        //         break;
        //     }
        //     System.out.println(j);
        // }
        System.out.println("Outside While");
    }
}
// break exits the immediate loop and return exits from the main.