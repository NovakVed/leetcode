# 1281. Subtract the Product and Sum of Digits of an Integer
# https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/?envType=problem-list-v2&envId=prshgx6i
class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        sum = 0
        product = 1
        while n:
            sum += n % 10
            product *= n % 10
            n //= 10
        return product - sum

s = Solution()
print(s.subtractProductAndSum(234))