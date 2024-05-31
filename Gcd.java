import java.util.*;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();

        String result = gcdOfStrings(str1, str2);

        System.out.println("The largest string x that divides both str1 and str2 is: " + result);

        sc.close();
    }

    public static String gcdOfStrings(String str1, String str2) {
        // If concatenated versions are not the same, there's no common divisor string
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Compute the greatest common divisor of the lengths of the two strings
        int gcdLength = gcd(str1.length(), str2.length());

        // Return the prefix of str1 (or str2) of length gcdLength
        return str1.substring(0, gcdLength);
    }

    // Helper method to compute the GCD of two numbers
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
