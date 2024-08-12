package palindromeNumber;

/**
 * 9. Palindrome Number
 * {@link} <a href=
 * "https://leetcode.com/problems/palindrome-number/description/">9. Palindrome
 * Number</a>
 */
class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    static boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int temp = x;
        int reversed = 0;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }

    /*
     * One solution
     */
    /*
     * static boolean isPalindrome(int x) {
     * if (x < 0)
     * return false;
     * String stringNum = String.valueOf(x);
     * int first = 0;
     * int last = stringNum.length() - 1;
     * while (first < last) {
     * if (stringNum.charAt(first) != stringNum.charAt(last)) {
     * return false;
     * }
     * first++;
     * last--;
     * }
     * 
     * return true;
     * }
     */

    /*
     * Maybe faster to code
     */
    /*
     * static boolean isPalindrome(int x) {
     * if (x < 0) return false;
     * String s = String.valueOf(x);
     * int n = s.length();
     * 
     * for (int i=0; i<n/2; i++) {
     * if (s.charAt(i) != s.charAt(n-i-1)) return false;
     * }
     * 
     * return true;
     * }
     */
}