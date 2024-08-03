package arabicsToRoman.dumb;

public class ArabicsToRomanEvenDumber {

    public static void main(String[] args) {
        int arabic = 3749;
        String roman = intToRoman(arabic);
        System.out.println(roman);
    }

    public static String intToRoman(int num) {
        String result = "";

        int m = num % 1000;
        num -= m * 1000;
        int c = num % 100;
        num -= c * 100;
        int x = num % 10;
        num -= x * 10;
        int i = num % 1;
        num -= i * 1;

        while (m-- != 0) {
            result += "M";
        }

        while (c != 0) {
            if (c >= 5) {
                result += "D";
                c -= 5;
            } else if (c == 4) {
                result += "CD";
                c -= 4;
            } else {
                result += "C";
                c--;
            }
        }

        while (x != 0) {
            if (x == 9) {
                result += "XC";
                x -= 9;
                break;
            } else if (x > 5) {
                result += "L";
                x -= 5;
            } else if (x == 4) {
                result += "XL";
                x -= 4;
            } else {
                result += "X";
                x--;
            }
        }

        while (i != 0) {
            if (i == 9) {
                result += "IX";
                break;
            } else if (i > 5) {
                result += "V";
                i -= 5;
            } else if (i == 4) {
                result = "IV";
                break;
            } else {
                result = "I";
                i -= 1;
            }
        }

        return result;
    }
}
