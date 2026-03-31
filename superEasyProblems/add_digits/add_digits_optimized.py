class Solution:
    def addDigits(self, num: int) -> int:
        if num == 0:
            return 0
        return 9 if num % 9 == 0 else num % 9

s = Solution()
print(s.addDigits(38))
