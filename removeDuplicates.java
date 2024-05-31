public class removeDuplicates {
    public static boolean [] map = new boolean[26];
        public static void RemoveDups(String str , int idx, String newString){
            if (idx == str.length()) {
                System.out.println(idx + newString);
                return;  
            }
            char currChar = str.charAt(idx);
            if (map[currChar-'a'] == true) {
                RemoveDups(str,idx+1,newString);
                 }
                 else{
                    newString+=currChar;
                    map[currChar-'a'] =true;
                    RemoveDups(str , idx+1,newString);
                 }
        }
    public static void main(String[] args) {
        String str = "aabbccdd";
        RemoveDups(str, 0, "");
        
    }
    
}
