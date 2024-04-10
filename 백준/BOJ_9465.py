"""
output: 뗄 수 있는 스티커 점수의 총합
1. 아이디어
    - 스티커 떼기
        위, 아래, 오른쪽, 왼쪽 못뗌
        1) 한칸 대각선 
        2) 두칸 대각선
        dp[0][i] += max(dp[1][i-1],dp[1][i-2])
        dp[1][i] += max(dp[0][i-1],dp[0][i-2])
2. 시간복잡도
n = 1e5
"""
import sys; input = sys.stdin.readline

T = int(input())
for _ in range(T):

    n = int(input())
    stickers = []

    for i in range(2):
        stickers.append(list(map(int,input().split())))
    
    stickers[0].insert(0,0)
    stickers[1].insert(0,0)

    for i in range(2,n+1):
        stickers[0][i] += max(stickers[1][i-1],stickers[1][i-2])
        stickers[1][i] += max(stickers[0][i-1],stickers[0][i-2])

    print(max(stickers[0][n],stickers[1][n]))