public class recursion {
    public static void printnum(int n){
        if(n == -1){
            return;
                }
                
        System.out.println(n); 
        // printnum(n-1);  
        n--;
        printnum(n);
     }
    public static void main(String[] args) {
        int num = 5;
        printnum(num);
    }
    
}
