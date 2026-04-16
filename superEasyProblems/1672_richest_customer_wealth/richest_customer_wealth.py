# 1672. Richest Customer Wealth
# https://leetcode.com/problems/richest-customer-wealth/description/?envType=problem-list-v2&envId=prshgx6i
from typing import List


class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        output = 0
        for account in accounts:
            output = max(output, sum(account))
        return output

s = Solution()
print(s.maximumWealth([[1,2,3],[3,2,1]]))