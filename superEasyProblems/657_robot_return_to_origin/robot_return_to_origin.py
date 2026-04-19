# 657. Robot Return to Origin
# https://leetcode.com/problems/robot-return-to-origin/?envType=problem-list-v2&envId=prshgx6i

class Solution:
    def judgeCircle(self, moves: str) -> bool:
        point = [0,0]
        for m in moves:
            if m == 'R':
                point[0] += 1
            if m == 'L':
                point[0] -= 1
            if m == 'U':
                point[1] += 1
            if m == 'D':
                point[1] -= 1
        return point == [0,0]

s = Solution()
print(s.judgeCircle('UD'))