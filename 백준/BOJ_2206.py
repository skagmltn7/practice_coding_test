"""
1. 아이디어
    - 이동
    x,y,cnt,chk
    - 벽 부수기
        - 벽부순애가 방문안함
        - 벽안부순애가 방문안함
        
"""
import sys; input = sys.stdin.readline
from collections import deque

n, m = map(int,input().split())
board = [list(input().rstrip()) for _ in range(n)]

def bfs():
    dy, dx = (-1,0,1,0), (0,1,0,-1)
    visited = [[[False for _ in range(2)] for _ in range(m)] for _ in range(n)]

    queue = deque()
    queue.append((0,0,1,0))

    visited[0][0][0], visited[0][0][1] = True, True

    while queue:
        y, x, cnt, chk = queue.popleft()
        if y == n-1 and x == m-1:return cnt

        for i in range(4):
            ny, nx = y + dy[i], x + dx[i]
            if 0 <= ny < n and 0 <= nx < m:
                if not visited[ny][nx][0] and board[ny][nx] == '0' and not chk:
                    visited[ny][nx][0] = True
                    queue.append((ny,nx,cnt+1,chk))
                if not visited[ny][nx][1]:
                    if (board[ny][nx] == '1' and not chk) or (board[ny][nx] == '0' and chk):
                        visited[ny][nx][1] = True
                        queue.append((ny,nx,cnt+1,1))
    return -1

print(bfs())
