public class stackheight {
    public static int calculatePower(int n , int x){
        if(n == 0){
            return 1;
        }
        if( x == 0){
            return 0;
        }
        // THIS is the code for the time complexity with logN
        // optimized code for the recursion
        if(n%2==0){
            return calculatePower(n/2, x)*calculatePower(n/2, x);
        }
        else{
            return calculatePower(n/2, x)*calculatePower(n/2, x)*x;
        }
        //this is the time complexity of N
        // int xPowe = calculatePower(n-1, x);
        // int xpown = x*xPowe;
        // return xpown;
        

        }
        public static void main(String[] args) {
            int n = 5,x  = 2;
            int ans = calculatePower(n, x);
            System.out.println(ans);
            
        }
    }
    
