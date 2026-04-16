# 1550. Three Consecutive Odds
# https://leetcode.com/problems/three-consecutive-odds/description/?envType=problem-list-v2&envId=prshgx6i
from typing import List


class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        for i in range(0, len(arr) - 2):
            if arr[i] * arr[i+1] * arr[i+2] % 2 == 1:
                return True
        return False

s = Solution()
print(s.threeConsecutiveOdds([1,2,34,3,4,5,7,23,12]))