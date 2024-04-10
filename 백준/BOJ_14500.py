"""
1. 아이디어
    - 남은 블럭만큼 maxval더한 것보다 answer이 크면 검사x 
    - dfs 상하좌우 검사
    - 블럭이 2개일때 ㅗ 모양 만들기
"""
import sys
input = sys.stdin.readline

dy = (-1,0,1,0)
dx = (0,1,0,-1)
answer = 0
max_val = 0

def dfs(y,x,block,total):
    global answer
    if answer >= total + max_val*(4-block): return
    if block == 4:
        answer = max(answer,total)
        return
    
    for i in range(4):
        ny, nx = y + dy[i], x + dx[i]
        if 0<=ny<n and 0<=nx<m and not visited[ny][nx]:
            if block == 2:
                visited[ny][nx]=True
                dfs(y,x,block+1,total + board[ny][nx])
                visited[ny][nx]=False
            visited[ny][nx] = True
            dfs(ny,nx,block+1,total + board[ny][nx])
            visited[ny][nx] = False
    
n, m = map(int,input().split())
visited = [[False for _ in range(m)] for _ in range(n)]
board = []
for _ in range(n):
    board.append(list(map(int,input().split())))
    max_val = max(max_val,max(board[-1]))

for i in range(n):
    for j in range(m):
        visited[i][j]=True
        dfs(i,j,1,board[i][j])
        visited[i][j]=False
print(answer)