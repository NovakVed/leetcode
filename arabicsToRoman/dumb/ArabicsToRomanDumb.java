package arabicsToRoman.dumb;

class ArabicsToRomanDumb {

    // https://leetcode.com/problems/integer-to-roman/
    public static void main(String[] args) {
        int arabic = 3749;
        String roman = intToRoman(arabic);
        System.out.println(roman);
    }

    public static String intToRoman(int num) {
        String result = "";

        while (num >= 1000) {
            result += "M";
            num -= 1000;
        }

        if (num >= 900) {
            result += "CM";
            num -= 900;
        }

        if (num >= 500) {
            result += "D";
            num -= 500;
        }

        if (num >= 400) {
            result += "CD";
            num -= 400;
        }

        while (num >= 100) {
            result += "C";
            num -= 100;
        }

        if (num >= 90) {
            result += "XC";
            num -= 90;
        }

        if (num >= 50) {
            result += "L";
            num -= 50;
        }

        if (num >= 40) {
            result += "XL";
            num -= 40;
        }

        while (num >= 10) {
            result += "X";
            num -= 10;
        }

        if (num == 9) {
            result += "IX";
            return result;
        }

        if (num > 4) {
            result += "V";
            num -= 5;
        }

        if (num == 4) {
            result += "IV";
            return result;
        }

        while (num > 0) {
            result += "I";
            num -= 1;
        }

        return result;
    }
}
