# 2894. Divisible and Non-divisible Sums Difference
# https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/
# optimized explanation: https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/solutions/6759736/divisible-and-non-divisible-sums-differe-sb65/
class Solution:
    def differenceOfSums(self, n: int, m: int) -> int:
        num1 = 0
        num2 = 0
        for i in range(1, n + 1):
            if i % m == 0:
                num2 += i
            else:
                num1 += i
        return num1 - num2

s = Solution()
print(s.differenceOfSums(10, 3))