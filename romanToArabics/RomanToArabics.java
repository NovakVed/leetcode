package romanToArabics;

/**
 * 13. RomanToInteger
 * {@link} https://leetcode.com/problems/roman-to-integer/description/
 */
class RomanToArabics {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    static int romanToInt(String s) {
        int sum = 0;
        char previous = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (previous == 'I' && (current == 'V' || current == 'X')) {
                sum -= 2;
            } else if (previous == 'X' && (current == 'L' || current == 'C')) {
                sum -= 20;
            } else if (previous == 'C' && (current == 'D' || current == 'M')) {
                sum -= 200;
            }

            switch (current) {
                case 'I':
                    sum += 1;
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    sum += 10;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    sum += 100;
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
                default:
                    break;
            }

            previous = current;
        }

        return sum;
    }
}
