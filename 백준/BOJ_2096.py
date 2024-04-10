"""
output:
1. 아이디어
    윗열 -1,0,1 검사로
    max dp
    min dp 
2. 시간복잡도
n = 1e5 O(nlogn)
"""
import sys; input = sys.stdin.readline

n = int(input())

max_dp = [0] * 3
min_dp = [0] * 3

max_tmp = [0] * 3
min_tmp = [0] * 3

for _ in range(n):
    n1, n2, n3 = map(int,input().split())
    for j in range(3):
        if j == 0:
            max_tmp[j] = n1 + max(max_dp[j], max_dp[j+1])
            min_tmp[j] = n1 + min(min_dp[j], min_dp[j+1])
        elif j == 1:
            max_tmp[j] = n2 + max(max_dp)
            min_tmp[j] = n2 + min(min_dp)
        else:
            max_tmp[j] = n3 + max(max_dp[j-1], max_dp[j])
            min_tmp[j] = n3 + min(min_dp[j-1], min_dp[j])
    max_dp = list(max_tmp)
    min_dp = list(min_tmp)

print(max(max_dp), min(min_dp))