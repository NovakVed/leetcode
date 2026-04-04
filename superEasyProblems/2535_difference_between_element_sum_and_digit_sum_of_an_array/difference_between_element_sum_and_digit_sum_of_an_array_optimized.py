# 2535. Difference Between Element Sum and Digit Sum of an Array
# https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array
from typing import List


class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        element_sum = 0
        digit_sum = 0
        for num in nums:
            element_sum += num
            while num: # 0 is falsy
                digit_sum += num % 10 # takes the last digit
                num //= 10 # removes the last digit
        return abs(element_sum - digit_sum)

s = Solution()
print(s.differenceOfSum([1,15,6,3]))