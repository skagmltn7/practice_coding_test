"""
1. 아이디어
    dp[n] = min(dp[n],dp[i**2]+dp[n-i**2])
2. 시간복잡도
n = 5e4 O(n^2)
"""
import sys; input = sys.stdin.readline
n = int(input())
dp = [0]*(n+1)

for i in range(1,int(n**.5)+1):
    dp[i**2]=1

if dp[n]!=0: 
    print(dp[n])
else:
    for i in range(2,n+1):
        dp[i] = dp[i-1]+1
        for j in range(2,int(i**.5)+1):
            dp[i] = min(dp[i],dp[i-j**2]+1)
    print(dp[n])