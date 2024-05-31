import java.util.*;


public class replace {
    // inthis code the  user have to give a string which contains "e "and finally output is the same string in which the character e is replaced with the  " i "
       public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     String str = sc.next();
     String result = "";


     for(int i=0; i<str.length(); i++) {
       if(str.charAt(i) == 'e') {
         result += 'i';
       } else {
         result += str.charAt(i);
       }
     }


     System.out.println(result);
     sc.close();
   }
}
 
