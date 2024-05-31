public class MoveX {
    public static void MoveXs(String str,int idx, int count, String newString){
        if(idx==str.length()){
            for(int i = 0 ; i < count; i++)
            {
                newString += "x";
            }
            System.out.println(newString);
            return;
        }
        char CurrChar = str.charAt(idx);
        if(CurrChar =='x'){
            count++;
            MoveXs(str, idx+1, count, newString);
        }else{
            newString+=CurrChar;
            MoveXs(str, idx+1, count, newString);
        }
    }
        public static void main(String[] args) {
            String str = "axbcxxd";
            MoveXs(str, 0, 0, "");
            
        }
}
