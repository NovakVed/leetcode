# 1822. Sign of the Product of an Array
# https://leetcode.com/problems/sign-of-the-product-of-an-array/description/?envType=problem-list-v2&envId=prshgx6i
from typing import List


class Solution:
    def arraySign(self, nums: List[int]) -> int:
        sign = 1
        for n in nums:
            if n == 0:
                return 0
            if n < 0:
                sign *= -1
        return sign

s = Solution()
print(s.arraySign([-1,-2,-3,-4,3,2,1]))