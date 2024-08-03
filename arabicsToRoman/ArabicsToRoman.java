package arabicsToRoman;

class ArabicsToRoman {
    public static void main(String[] args) {
        int arabic = 3749;
        String roman = intToRoman(arabic);
        System.out.println(roman);
    }

    public static String intToRoman(int num) {
        String[] ones = new String[] { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        String[] tens = new String[] { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String[] hrns = new String[] { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String[] ths = new String[] { "", "M", "MM", "MMM" };

        return ths[num / 1000] + hrns[(num % 1000) / 100] + tens[(num % 100) / 10] + ones[num % 10];
    }
}
