import sys
input = sys.stdin.readline

n, m = map(int,input().split())
nums=[0]
nums.extend(list(map(int,input().split())))
for i in range(1,len(nums)):
    nums[i]+=nums[i-1]

for _ in range(m):
    i,j = map(int,input().split())
    print(nums[j]-nums[i-1])