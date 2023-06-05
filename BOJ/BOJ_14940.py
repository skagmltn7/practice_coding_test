"""
output: 목표지점까지의 최소거리
1. 아이디어
    - 출발지 좌표찾기
    - 이동
        2 출발
        1 갈 수 있음
        0 못감

"""
import sys
from collections import deque
input = sys.stdin.readline

def dist(target):
    dy = (-1,0,1,0)
    dx = (0,1,0,-1)
    queue = deque()
    
    y,x = target
    queue.append((y,x,0))
    visited[y][x]=True
    board[y][x]=0
    while queue:
        ny,nx,dist = queue.popleft()
        for i in range(4):
            ey, ex = ny + dy[i], nx + dx[i]
            if 0<=ey<n and 0<=ex<m:
                if not visited[ey][ex] and board[ey][ex]==1:
                    board[ey][ex] = dist+1
                    visited[ey][ex] = True
                    queue.append((ey,ex,dist+1))
def chkCantGo():
    for i in range(n):
        for j in range(m):
            if not visited[i][j] and board[i][j] == 1:
                board[i][j] = -1

n,m = map(int,input().split())
board=[]
start_chk = False
target=[]
for i in range(n):
    board.append(list(map(int,input().split())))
    if not start_chk:
        if 2 in board[-1]: 
            start_chk = True
            target = [i,board[-1].index(2)]

visited = [[False for _ in range(m)] for _ in range(n)]
dist(target)
chkCantGo()

for b in board:
    print(' '.join(map(str,b)))