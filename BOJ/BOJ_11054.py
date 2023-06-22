"""
1. 아이디어
    -바이토닉 
    증가하는 부분수열
    감소하는 부분수열
    증가dp + 감소dp가  max인 인덱스가 sk
"""
import sys; input = sys.stdin.readline
n = int(input())
A = list(map(int,input().split()))
iDp, dDp = [1] * n, [1] * n

for i in range(n):
    for j in range(i):
        if A[i] > A[j]:
            iDp[i] = max(iDp[i],iDp[j]+1)

for i in range(n-1,-1,-1):
    for j in range(n-1,i,-1):
        if A[i] > A[j]:
            dDp[i] = max(dDp[i],dDp[j]+1)

answerDp=[0]*n
for i in range(n):
    answerDp[i] = iDp[i] + dDp[i]

print(max(answerDp)-1)
