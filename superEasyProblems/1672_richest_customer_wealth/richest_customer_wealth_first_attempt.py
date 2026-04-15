# 1672. Richest Customer Wealth
# https://leetcode.com/problems/richest-customer-wealth/description/?envType=problem-list-v2&envId=prshgx6i
class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        output = 0
        for account in accounts:
            current = 0
            for n in account:
                current += n
            if output < current:
                output = current
        return output

s = Solution()
print(s.maximumWealth([[1,2,3],[3,2,1]]))