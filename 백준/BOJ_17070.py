"""
output: 이동시키는 방법의 개수
1. 아이디어
    - 이동
        - ㅡ일 경우 : ㅡ,대각선
        - ㅣ일 경우 : ㅣ,대각선
        - 대각선일 경우: ㅡ,ㅣ, 대각선
"""
import sys; input = sys.stdin.readline

N = int(input())
board = [[0 for _ in range(N+1)]for _ in range(N+1)]

for i in range(1,N+1):
    board[i][1:] = list(map(int,input().split()))

def move():
    dp = [[[0 for _ in range(N+1)]for _ in range(N+1)]for _ in range(3)]
    dp[0][1][2] = 1

    for i in range(3,N+1): 
        if board[1][i] == 0: dp[0][1][i] =  dp[0][1][i-1]
    
    for y in range(2,N+1):
        for x in range(2,N+1):
            if board[y][x] == 1: continue
            dp[0][y][x] = dp[0][y][x-1] + dp[2][y][x-1]
            dp[1][y][x] = dp[1][y-1][x] + dp[2][y-1][x]
            if board[y-1][x] == 0 and board[y][x-1]==0:
                dp[2][y][x] = dp[2][y-1][x-1] + dp[0][y-1][x-1] + dp[1][y-1][x-1]

    return sum(dp[i][N][N] for i in range(3))

print(move())
