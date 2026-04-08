# 3024. Type of Triangle
# https://leetcode.com/problems/type-of-triangle/?envType=problem-list-v2&envId=prshgx6i
class Solution:
    def triangleType(self, nums: List[int]) -> str:
        a, b, c = sorted(nums)
        if a + b <= c:
            return "none"
        if a == b == c:
            return "equilateral"
        elif a == b or b == c or a == c:
            return "isosceles"
        else:
            return "scalene"

s = Solution()
print(s.triangleType([3,4,5]))