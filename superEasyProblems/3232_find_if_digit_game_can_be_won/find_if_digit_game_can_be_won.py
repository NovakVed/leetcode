# 3232. Find if Digit Game Can Be Won
# https://leetcode.com/problems/find-if-digit-game-can-be-won/description/?envType=problem-list-v2&envId=prshgx6i
from typing import List


class Solution:
    def canAliceWin(self, nums: List[int]) -> bool:
        single = 0
        double = 0
        for n in nums:
            if n > 9:
                double += n
            else:
                single += n
        return single != double
                

s = Solution()
print(s.canAliceWin([1,2,3,4,5,14]))