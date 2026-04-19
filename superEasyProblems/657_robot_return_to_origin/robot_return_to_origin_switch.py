# 657. Robot Return to Origin
# https://leetcode.com/problems/robot-return-to-origin/?envType=problem-list-v2&envId=prshgx6i

class Solution:
    def judgeCircle(self, moves: str) -> bool:
        point = [0,0]
        for m in moves:
            match m:
                case 'R':
                    point[0] += 1
                case 'L':
                    point[0] -= 1
                case 'U':
                    point[1] += 1
                case'D':
                    point[1] -= 1
        return point == [0,0]

s = Solution()
print(s.judgeCircle('UD'))