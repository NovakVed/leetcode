import sys
from typing import List


class Solution:
    def numberGame(self, nums: List[int]) -> List[int]:
        result = []
        nums.sort()
        for i in range(0, len(nums), 2):
            result.append(nums[i + 1])
            result.append(nums[i])
        return result

s = Solution()
print(s.numberGame([5, 4, 2, 3]))