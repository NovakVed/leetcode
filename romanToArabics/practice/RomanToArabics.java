package romanToArabics.practice;

import java.util.Map;

/**
 * 13. RomanToInteger
 * {@link} https://leetcode.com/problems/roman-to-integer/description/
 */
class RomanToArabics {
    static Map<Character, Integer> romanToArabicNumerals = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000);

    public static void main(String[] args) {
        String romanNumber = "LVIII";
        int arabicNumber = romanToArabicConverter(romanNumber);
        System.out.println(arabicNumber);
    }

    private static int romanToArabicConverter(String romanNumber) {
        int result = 0;
        char previousChar = 0;
        for (int i = 0; i < romanNumber.length(); i++) {
            char c = romanNumber.charAt(i);

            if (previousChar == 'I' && (c == 'V' || c == 'X')) {
                result -= 2;
            } else if (previousChar == 'X' && (c == 'L' || c == 'C')) {
                result -= 20;
            } else if (previousChar == 'C' && (c == 'D' || c == 'M')) {
                result -= 200;
            }

            previousChar = c;
            result += romanToArabicNumerals.get(c);
        }

        return result;
    }
}
