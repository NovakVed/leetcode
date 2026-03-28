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