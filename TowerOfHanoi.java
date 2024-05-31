public class TowerOfHanoi {
    // this is the towerof hanoi problem solved using the recursion and it follows the 2^n-1  time complexity.
    public static void Towerofhanoirec(int n,String S,String H,String DES){
        if( n == 1){
            System.out.println("transfer disk" + n + "from"+  S + " to " + DES);
            return;
        }
        Towerofhanoirec(n-1, S, DES, H);
        System.out.println("transfer disk" + n + "from"+  S + " to " + DES);
        Towerofhanoirec(n-1, H, S, DES);
    }
    public static void main(String[] args) {
        int n =1;
        
        Towerofhanoirec(n, "src", "hel", "des");
    }
    
}
