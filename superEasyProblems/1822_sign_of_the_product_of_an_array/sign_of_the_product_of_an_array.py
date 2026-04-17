# 1822. Sign of the Product of an Array
# https://leetcode.com/problems/sign-of-the-product-of-an-array/description/?envType=problem-list-v2&envId=prshgx6i
from typing import List


class Solution:
    def arraySign(self, nums: List[int]) -> int:
        def signFunc(x):
            if x > 0:
                return 1
            elif x < 0:
                return -1
            return 0
        product = 1
        for n in nums:
            product *= n
        return signFunc(product)

s = Solution()
print(s.arraySign([-1,-2,-3,-4,3,2,1]))