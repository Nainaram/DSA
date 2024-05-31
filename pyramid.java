public class pyramid {
    public static void main(String[] args) {
        int  n =4;
        //int m =5;
        // this is the code  to print the pyramid
        // for( int i = 1; i <=n ; i++){
        //     for ( int j =1; j <=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }
        // this is the code for the reverse pyramid
        for( int i = n; i >=1; i--){
            for ( int j = 1;j <=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
