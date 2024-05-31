import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int [] numbers = new int[size];
       
       
        System.out.println("Array size is " + size);
        System.out.println("Enter the values of the array:");
        for(int i = 0; i <size;i++ ){
            numbers[i]=sc.nextInt();
            }
            System.out.println( "the numbers in array are follows:");
            for( int j = 0; j <numbers.length;j++){
                
                System.out.print( numbers[j] );
            }
            System.out.println();
            System.out.println("Want to know the which element is at is which index:");
                System.out.println("enter the element you want to search:");
                int search = sc.nextInt();
                for( int i = 0; i < numbers.length; i++){
                    if(numbers[i]==search){
                        System.out.println("The element " + search + "found at index " + i );
                    }
                }
    sc.close();

    }
    
}
