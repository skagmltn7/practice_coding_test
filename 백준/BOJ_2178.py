"""
output: (1,1)에서 (N,M)까지 지나는 최소 칸의 수
1. 아이디어
    - 맵조정
    - 이동(bfs)
"""
import sys
from collections import deque
input = sys.stdin.readline

def move(x,y):
    dy = (1,0,-1,0)
    dx = (0,1,0,-1)
    visited = [[False for _ in range(m+1)] for _ in range(n+1)]
    queue = deque()
    queue.append((y,x,1))
    visited[y][x] = True

    while queue:
        ny,nx,nxt_cnt = queue.popleft()
        if ny==n and nx==m: return nxt_cnt
        for i in range(4):
            ey = ny + dy[i]
            ex = nx + dx[i]
            if 1 <= ey <= n and 1 <= ex <= m:
                if board[ey][ex]==1 and not visited[ey][ex]:
                    visited[ey][ex]=True
                    queue.append((ey,ex,nxt_cnt+1))

n,m = map(int,input().split())
board=[]

board.append([0]*(m+1))
for _ in range(n):
    li=[0]
    tmp = input().rstrip()
    for i in tmp:
        li.append(int(i))
    board.append(li.copy())
    
print(move(1,1))
