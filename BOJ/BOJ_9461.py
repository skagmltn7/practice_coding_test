"""
output:
1. 아이디어
    length[i] = length[i-3]+length[i-2]
"""
import sys
input = sys.stdin.readline

T = int(input())
nums = []
for _ in range(T):
    nums.append(int(input()))

length = [1,1,1]
for i in range(3,max(nums)):
    length.append(length[-3] + length[-2])

for n in nums: print(length[n-1])