import java.util.HashSet;
// this is the code how a string characters can be re used and in to the subsequenced and  also is checkes any  repeated it will automatically eliminate that string.
public class Recursion2 {
    public static void subSequence(String str , int idx, String newString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
             return;}
             else{
               
                System.out.println(newString);
                set.add(newString);
                return;
             }
        }
        char CurrChar = str.charAt(idx);
        // to be 
        subSequence(str, idx+1, newString+CurrChar,set);
        // to be 
        subSequence(str, idx+1, newString,set);
    }    
    public static void main(String[] args) {
        String str = "abc";
        HashSet<String> set= new HashSet<>() ;
        subSequence(str, 0, "",set);
    }
}
