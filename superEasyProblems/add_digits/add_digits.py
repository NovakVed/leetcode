# 258. Add Digits
# https://leetcode.com/problems/add-digits/description/?envType=problem-list-v2&envId=prshgx6i
class Solution:
    def addDigits(self, num: int) -> int:
        while num > 9:
            result = 0
            for i in str(num):
                result += int(i)
            num = result
        return num

s = Solution()
print(s.addDigits(38))