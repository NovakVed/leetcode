# 657. Robot Return to Origin
# https://leetcode.com/problems/robot-return-to-origin/?envType=problem-list-v2&envId=prshgx6i

class Solution:
    def judgeCircle(self, moves: str) -> bool:
        x = y = 0
        for move in moves:
            if move == 'U': y -= 1
            elif move == 'D': y += 1
            elif move == 'L': x -= 1
            elif move == 'R': x += 1

        return x == y == 0

s = Solution()
print(s.judgeCircle('UD'))