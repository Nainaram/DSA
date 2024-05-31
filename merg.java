import java.util.Scanner;

public class merg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first word:");
        String word1 = sc.nextLine();
        
        System.out.println("Enter the second word:");
        String word2 = sc.nextLine();
        
        StringBuilder mergedString = new StringBuilder();
        
        int maxLength = Math.max(word1.length(), word2.length());
        
        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) {
                mergedString.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                mergedString.append(word2.charAt(i));
            }
        }
        
        System.out.println("Merged string: " + mergedString.toString());
        
        sc.close();
    }
}
