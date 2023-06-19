import sys; input = sys.stdin.readline

a = input().rstrip()
b = input().rstrip()

aLength, bLength = len(a), len(b)
dp = [[0 for _ in range(aLength+1)] for _ in range(bLength+1)]

for i in range(1,bLength+1):
    for j in range(1,aLength+1):
        if a[j-1] == b[i-1]:
            dp[i][j] = dp[i-1][j-1] + 1
        else:
            dp[i][j] = max(dp[i-1][j],dp[i][j-1])
print(dp[-1][-1])
