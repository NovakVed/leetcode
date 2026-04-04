# 2535. Difference Between Element Sum and Digit Sum of an Array
# https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array
from typing import List


class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        element_sum = 0
        digit_sum = 0
        for num in nums:
            element_sum += num
            for c in str(num):
                digit_sum += int(c)
        return abs(element_sum - digit_sum)

s = Solution()
print(s.differenceOfSum([1,15,6,3]))