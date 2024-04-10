"""
output: 점수의 최댓값
1. 아이디어
    - 최대(전전전칸) + 전칸 +현재값
    - 최대(전전칸) + 현재값
"""
import sys
input = sys.stdin.readline

n = int(input())
stairs = []
for _ in range(n): stairs.append(int(input()))
stairs.insert(0,0)

if n>2:
    dp=[0]*(n+1)
    dp[1] = stairs[1]
    dp[2] = stairs[1]+stairs[2]
    for i in range(3,n+1):
        dp[i] = max(dp[i-2]+stairs[i],dp[i-3]+stairs[i-1]+stairs[i])
    print(dp[-1])
else:
    print(sum(stairs))