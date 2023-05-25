import sys
input = sys.stdin.readline
n=int(input())
nums=[0]*10001
for _ in range(n): 
    e = int(input())
    nums[e]+=1
cnt=0
for i in range(10001):
    if nums[i]==0:continue
    cnt+=nums[i]
    while nums[i]:
        nums[i]-=1
        print(i)
    if cnt==n: break
    
