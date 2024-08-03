package arabicsToRoman.dumb;

class ArabicsToRomanDumb {

    // https://leetcode.com/problems/integer-to-roman/
    public static void main(String[] args) {
        int arabic = 3749;
        String roman = intToRoman(arabic);
        System.out.println(roman);
    }

    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();

        while (num >= 1000) {
            result.append("M");
            num -= 1000;
        }

        if (num >= 900) {
            result.append("CM");
            num -= 900;
        }

        if (num >= 500) {
            result.append("D");
            num -= 500;
        }

        if (num >= 400) {
            result.append("CD");
            num -= 400;
        }

        while (num >= 100) {
            result.append("C");
            num -= 100;
        }

        if (num >= 90) {
            result.append("XC");
            num -= 90;
        }

        if (num >= 50) {
            result.append("L");
            num -= 50;
        }

        if (num >= 40) {
            result.append("XL");
            num -= 40;
        }

        while (num >= 10) {
            result.append("X");
            num -= 10;
        }

        if (num == 9) {
            result.append("IX");
            return result.toString();
        }

        if (num > 4) {
            result.append("V");
            num -= 5;
        }

        if (num == 4) {
            result.append("IV");
            return result.toString();
        }

        while (num > 0) {
            result.append("I");
            num -= 1;
        }

        return result.toString();
    }
}
