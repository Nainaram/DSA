import java.util.*;
public class Cummalitivesum {
    // this code will the take the size from the user and also take the inputs of the arrays from the user  and finally cummalate and give the totallenght of the array characters as output
    
   public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     System.out.println("enter the size of the array");
     int size = sc.nextInt();
     String array[] = new String[size];
     int totLength = 0;


     for(int i=0; i<size; i++) {
       array[i] = sc.next();
       totLength += array[i].length();
     }


     System.out.println(totLength);
     sc.close();
   }
}


