import java.util.*;

public class fibinacci {
    public static void printFib(int a, int b , int n){
       if(n == 0){
        return;
       }
       int c = a+b;
       System.out.print(c + " ");
       printFib(b, c, n-1);

    }
    public static void main(String[] args) {
        int a = 0 ,b = 1; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to print the fibonacci series");
        int n = sc.nextInt();
        System.out.print(a);
        System.out.print(b);
        printFib(a,b,n-2);
            sc.close();
    }
    
}
