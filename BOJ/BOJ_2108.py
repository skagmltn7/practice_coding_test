import sys
from collections import Counter
input=sys.stdin.readline

n = int(input())
nums = []
for _ in range(n): nums.append(int(input()))
nums.sort()
print(round(sum(nums)/n))
print(nums[n//2])
if n==1: print(nums[0])
else:
    tmp = Counter(nums).most_common(2)
    if tmp[0][1]==tmp[1][1]: print(tmp[1][0])
    else: print(tmp[0][0])

print(nums[-1]-nums[0])