"""
1. 아이디어
    -클경우 넣기
    -작을경우 
        -안넣기
        -안작을때까지 빼고 넣기 
    -max(len)
"""
import sys; input = sys.stdin.readline
n = int(input())
arr = list(map(int,input().split()))
dp = [1]*n
for i in range(1,n):
    for j in range(i):
        if arr[j]<arr[i]: dp[i] = max(dp[j]+1,dp[i])
print(max(dp))