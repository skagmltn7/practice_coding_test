"""
1. 아이디어
0-1 knapsack
max(dp[i-1][j], dp[i-1][j-w[i]]+v[i])
"""
import sys; input = sys.stdin.readline
n, k = map(int,input().split())
w, v = [0],[0]

for _ in range(n):
    weight, value = map(int,input().split())
    w.append(weight)
    v.append(value)

dp = [0 for _ in range (k+1)]

for i in range(1,n+1):
    for j in range(k,-1,-1):
        if j-w[i]<0: break
        dp[j] = max(dp[j], dp[j-w[i]]+v[i])
print(dp[k])