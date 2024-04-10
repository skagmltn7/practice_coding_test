"""
1. 아이디어
    - 이동
    dfs
    - 알파벳 체크
    set not in
"""
import sys; input = sys.stdin.readline

r, c = map(int, input().split())
board = [list(input().rstrip()) for _ in range(r)]

answer = 0
route = set()
dy, dx = (-1,0,1,0), (0,1,0,-1)

def dfs(y,x,cnt):
    global answer
    answer = max(answer, cnt)
    route.add(board[y][x])
    
    for i in range(4):
        ny, nx = y + dy[i], x + dx[i]
        if 0 <= ny < r and 0 <= nx < c:
            if board[ny][nx] not in route:
                dfs(ny,nx,cnt+1)
    route.remove(board[y][x])

dfs(0,0,1)
print(answer)