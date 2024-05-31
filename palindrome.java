public class palindrome {
    public boolean isPalindrome(int x){
        if(x <0){
            return false;
        }
        int rev = 0;
        int original  = x;
        while (x!= 0 ){
            rev = rev *10 + x%10;
            x/=10;
        }
        return original == rev;

    }
    public static void main(String[] args) {
        palindrome  sol = new palindrome();
        int testNumber1 = 121;
        System.out.println("Is " + testNumber1 + " a palindrome? " + sol.isPalindrome(testNumber1)); // true

        int testNumber2 = -12-1;
        System.out.println("Is " + testNumber2 + " a palindrome? " + sol.isPalindrome(testNumber2)); // false

        int testNumber3 = 12321;
        System.out.println("Is " + testNumber3 + " a palindrome? " + sol.isPalindrome(testNumber3)); // true

        int testNumber4 = 10;
        System.out.println("Is " + testNumber4 + " a palindrome? " + sol.isPalindrome(testNumber4)); // false
    }

}
