package neetCode.twoPointers.validPalindrome;

/**
 * 125. Valid Palindrome
 * {@link} <a href=
 * "https://leetcode.com/problems/valid-palindrome/description/">125. Valid
 * Palindrome</a>
 */
class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String lowerCase = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            char lc = lowerCase.charAt(left);
            char rc = lowerCase.charAt(right);
            if (!(lc >= 'a' && lc <= 'z')
                    && !(lc >= '0' && lc <= '9')) {
                left++;
                continue;
            }

            if (!(rc >= 'a' && rc <= 'z')
                    && !(rc >= '0' && rc <= '9')) {
                right--;
                continue;
            }

            if (lc != rc) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
