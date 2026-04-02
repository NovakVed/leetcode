from typing import List


class Solution:
    def firstPalindrome(self, words: List[str]) -> str:
        for word in words:
            if self.isPalindrome(word):
                return word
        return ""
    
    def isPalindrome(self, word: str) -> bool:
        i, j = 0, len(word) - 1
        while i <= j:
            if word[i] != word[j]:
                return False
            i += 1
            j -= 1
        return True

s = Solution()
print(s.firstPalindrome(["pp","car","ada","racecar","cool"]))