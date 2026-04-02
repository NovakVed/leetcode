# 258. Add Digits
# https://leetcode.com/problems/add-digits/description/?envType=problem-list-v2&envId=prshgx6i
class Solution:
    def addDigits(self, num: int) -> int:
        if num == 0:
            return 0
        return 9 if num % 9 == 0 else num % 9

s = Solution()
print(s.addDigits(38))
