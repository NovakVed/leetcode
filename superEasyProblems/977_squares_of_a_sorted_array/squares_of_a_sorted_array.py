# 977. Squares of a Sorted Array
# https://leetcode.com/problems/squares-of-a-sorted-array/description/?envType=problem-list-v2&envId=prshgx6i
from typing import List


class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        return sorted([x*x for x in nums])

s = Solution()
print(s.sortedSquares([-4,-1,0,3,10]))