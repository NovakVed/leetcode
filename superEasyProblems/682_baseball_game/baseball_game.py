# 682. Baseball Game
# https://leetcode.com/problems/baseball-game/?envType=problem-list-v2&envId=prshgx6i
from typing import List


class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stack = []
        for op in operations:
            if op == 'C':
                stack.pop()
            elif op == 'D':
                stack.append(stack[-1] * 2)
            elif op == '+':
                stack.append(stack[-2] + stack[-1])
            else:
                stack.append(int(op))
        return sum(stack)

s = Solution()
print(s.calPoints(["5","2","C","D","+"]))