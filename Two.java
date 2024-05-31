import java.util.Scanner;

public class Two {
    // THIS IS CODE FOR THE 2D ARRAYS 
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int  columns  = sc.nextInt();
        int[][]  numbers = new int[rows][columns];
        for( int i = 0 ; i < numbers.length; i++){
            for( int  j = 0; j < numbers.length; j++){
                numbers[i][j] = sc.nextInt();
            }
           
        }
        System.out.println("THE ELEMENTS IN THE MATRICES ARE AS FOLLOWS:");
        for( int i = 0 ; i < numbers.length; i++){
            for( int  j = 0; j < numbers.length; j++){
               System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
           
        }
        // this is code to search the element at the index in 2d arrays
        System.out.println("Want to know the which element is at is which index:");
        System.out.println("enter the element you want to search:");
        int search = sc.nextInt();
        for( int i = 0; i < numbers.length; i++){
            for( int  j = 0; j < numbers.length; j++){
            if(numbers[i][j]==search){
                System.out.println("The element " + search + "found at index "+ "(" + i + " "+ j+ ")" );
            }
        }
        }

    }
    
}
