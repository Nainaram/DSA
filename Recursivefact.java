import java.util.Scanner;

public class Recursivefact {
    // this is the recursive function in  the function called until the base statement satisfied!!!0
    public static int calculatefact(int n ){

        if(n == 0 || n ==1){
            return 1;
        }
        int fact_nm1 = calculatefact(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;

    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the number to find the factorial of a number");
        int num = sc.nextInt();
        int result = calculatefact(num);
        System.out.println(result);
        sc.close();
    }
    
    
}
