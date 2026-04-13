# 2769. Find the Maximum Achievable Number
# https://leetcode.com/problems/find-the-maximum-achievable-number/description/?envType=problem-list-v2&envId=prshgx6i
class Solution:
    def theMaximumAchievableX(self, num: int, t: int) -> int:
        return num + 2 * t

s = Solution()
print(s.theMaximumAchievableX(num=4, t=1))