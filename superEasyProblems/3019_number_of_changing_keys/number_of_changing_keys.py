# 3019. Number of Changing Keys
# https://leetcode.com/problems/number-of-changing-keys/description/?envType=problem-list-v2&envId=prshgx6i
class Solution:
    def countKeyChanges(self, s: str) -> int:
        changes = 0
        for i in range(1, len(s)):
            if s[i - 1].lower() != s[i].lower():
                changes += 1
        return changes

s = Solution()
print(s.countKeyChanges('aAbBcC'))