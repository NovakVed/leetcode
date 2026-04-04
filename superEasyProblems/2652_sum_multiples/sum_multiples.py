# 2652. Sum Multiples
# https://leetcode.com/problems/sum-multiples/description/
# optimized solution https://leetcode.com/problems/sum-multiples/solutions/6206751/beats-100-o1-solutionbasic-maths-python3-f6dk/?envType=problem-list-v2&envId=prshgx6i
class Solution:
    def sumOfMultiples(self, n: int) -> int:
        sum = 0
        for i in range(1, n + 1):
            if i % 3 == 0 or i % 5 == 0 or i % 7 == 0:
                sum += i
        return sum

s = Solution()
print(s.sumOfMultiples(7))