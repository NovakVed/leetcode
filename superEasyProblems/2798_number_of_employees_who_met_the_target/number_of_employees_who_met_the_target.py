# 2798. Number of Employees Who Met the Target
# https://leetcode.com/problems/number-of-employees-who-met-the-target/description/?envType=problem-list-v2&envId=prshgx6i
from typing import List


class Solution:
    def numberOfEmployeesWhoMetTarget(self, hours: List[int], target: int) -> int:
        result = 0
        for hour in hours:
            if hour >= target:
                result += 1
        return result

s = Solution()
print(s.numberOfEmployeesWhoMetTarget([0,1,2,3,4], 2))