public class reverseStringRec {
    public static void printRev(int idx, String str){
        if(idx ==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(idx-1, str);
    }
    public static void main(String[] args) {
        String  str = "mareerhsiaJ";
        printRev(str.length()-1, str);

    }
}
