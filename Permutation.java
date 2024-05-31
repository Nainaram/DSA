public class Permutation {
    public static void PrintPermi(String str , String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i = 0; i < str.length();i++){
                char CurrChar = str.charAt(i);
                //  "abc" -> "ab"
                String newStr = str.substring(0,i)+ str.substring(i+1);
                PrintPermi(newStr, permutation+CurrChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        PrintPermi(str, "");
    }
}
