import java.util.*;
public class factorial {
    public static void printFactorial(int n ){
       int  factorial = 1; 
       if(n <1){
        System.out.println("invalid factorial");
        return ;
       }
        for(int i = n; i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println("Factorial of the " + n + " is " + factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value to find the factorial");
        int num = sc.nextInt();
       
        printFactorial(num);
        
    }
}
