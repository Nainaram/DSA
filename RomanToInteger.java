
public class RomanToInteger {
    public int romanToInt(String s) {
        int total = 0;
        int length = s.length();

        // Iterate through the Roman numeral string
        for (int i = 0; i < length; i++) {
            int currentVal = romanCharToInt(s.charAt(i));
            if (i < length - 1) {
                int nextVal = romanCharToInt(s.charAt(i + 1));
                // Apply subtraction rule
                if (currentVal < nextVal) {
                    total -= currentVal;
                } else {
                    total += currentVal;
                }
            } else {
                total += currentVal;
            }
        }

        return total;
    }

    private int romanCharToInt(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // This case should never be hit if the input is a valid Roman numeral
        }
    }

    public static void main(String[] args) {
        RomanToInteger converter = new RomanToInteger();
        
        String roman1 = "III";
        System.out.println("Roman numeral " + roman1 + " is " + converter.romanToInt(roman1));

        String roman2 = "IV";
        System.out.println("Roman numeral " + roman2 + " is " + converter.romanToInt(roman2));

        String roman3 = "IX";
        System.out.println("Roman numeral " + roman3 + " is " + converter.romanToInt(roman3));

        String roman4 = "LVIII";
        System.out.println("Roman numeral " + roman4 + " is " + converter.romanToInt(roman4));

        String roman5 = "MCMXCIV";
        System.out.println("Roman numeral " + roman5 + " is " + converter.romanToInt(roman5));
    }
}
