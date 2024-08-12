package palindromeNumber.practice;

class PalindromeNumber1 {

    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        for (int i = 0; i < num.length() / 2; i++) {
            if (num.charAt(i) != num.charAt(num.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
