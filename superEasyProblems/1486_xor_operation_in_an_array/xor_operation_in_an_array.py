# 1486. XOR Operation in an Array
# https://leetcode.com/problems/xor-operation-in-an-array/description/
# https://leetcode.com/problems/xor-operation-in-an-array/solutions/7686132/o1-time-o1-space-python-solution-a-compr-jvji/?envType=problem-list-v2&envId=prshgx6i
class Solution:
    def xorOperation(self, n: int, start: int) -> int:
        result = 0
        for k in range(n):
            result ^= start + 2 * k
        return result

s = Solution()
print(s.xorOperation(5, 0))