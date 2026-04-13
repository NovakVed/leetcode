# 2520. Count the Digits That Divide a Number
# https://leetcode.com/problems/count-the-digits-that-divide-a-number/description/?envType=problem-list-v2&envId=prshgx6i
class Solution:
    def countDigits(self, num: int) -> int:
        count = 0
        for c in str(num):
            if num % int(c) == 0:
                count += 1
        return count
        
s = Solution()
print(s.countDigits(121))