# 1550. Three Consecutive Odds
# https://leetcode.com/problems/three-consecutive-odds/description/?envType=problem-list-v2&envId=prshgx6i
from typing import List


class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        consecutive_odds = 0
        for n in arr:
            if n % 2 == 1:
                consecutive_odds += 1
                if consecutive_odds == 3:
                    return True
            else:
                consecutive_odds = 0
        return False

s = Solution()
print(s.threeConsecutiveOdds([1,2,34,3,4,5,7,23,12]))