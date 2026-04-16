# 2652. Sum Multiples
# https://leetcode.com/problems/sum-multiples/description/
# optimized solution https://leetcode.com/problems/sum-multiples/solutions/6206751/beats-100-o1-solutionbasic-maths-python3-f6dk/?envType=problem-list-v2&envId=prshgx6i
class Solution:
    def sumOfMultiples(n: int) -> int:
        def sum_divisible_by(k):
            m = n // k
            return k * m * (m + 1) // 2

        return (
            sum_divisible_by(3) + sum_divisible_by(5) + sum_divisible_by(7)
            - sum_divisible_by(15) - sum_divisible_by(21) - sum_divisible_by(35)
            + sum_divisible_by(105)
        )

s = Solution()
print(s.sumOfMultiples(7))