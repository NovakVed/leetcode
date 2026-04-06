# 2974. Minimum Number Game
# https://leetcode.com/problems/minimum-number-game/description/?envType=problem-list-v2&envId=prshgx6i
import sys
from typing import List

# space complexity O(1) if not counting output
class Solution:
    def numberGame(self, nums: List[int]) -> List[int]:
        nums.sort()
        for i in range(0, len(nums), 2):
            nums[i], nums[i+1] = nums[i+1], nums[i]
        return nums

s = Solution()
print(s.numberGame([5, 4, 2, 3]))