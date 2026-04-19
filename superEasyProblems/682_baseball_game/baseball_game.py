# 682. Baseball Game
# https://leetcode.com/problems/baseball-game/?envType=problem-list-v2&envId=prshgx6i
from typing import List


class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stack = []
        for i in range(0, len(operations)):
            if operations[i] == 'C':
                stack.pop()
            elif operations[i] == 'D':
                stack.append(stack[-1] * 2)
            elif operations[i] == '+':
                stack.append(stack[-2] + stack[-1])
            else:
                stack.append(int(operations[i]))
        return sum(stack)

s = Solution()
print(s.calPoints(["5","2","C","D","+"]))