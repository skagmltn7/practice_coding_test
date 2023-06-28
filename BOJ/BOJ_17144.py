"""
1. 아이디어
    - 위치
    - 미세먼지 확산
            vol = a[y][x] //5
            if a[y][x] - vol < 0:
                공기청정기X, 범위 안
                a[y][x] -= vol
                먼지 push
    - 공기청정기 순환
        1) 윗쪽
        오->위->왼->아
        2) 아랫쪽
        오->아->왼->위
"""
import sys; input = sys.stdin.readline
from collections import deque

dy = (-1,0,1,0)
dx = (0,1,0,-1)

def initQ():
    for i in range(1,r+1):
        for j in range(1,c+1):
            if board[i][j] > 0: queue.append((i,j,board[i][j]))

def spread(queue):
    while queue:
        y,x, amount = queue.popleft()
        vol = amount // 5
        if vol == 0: continue
        for i in range(4):
            ny, nx = y + dy[i], x + dx[i]
            if 0 < ny <= r and 0 < nx <= c and board[ny][nx] != -1:
                board[ny][nx] += vol
                board[y][x] -= vol

def cleaning(aircleaner,move):
    y, x = aircleaner
    tmp = 0
    i = 1
    ny, nx = y, x
    for _ in range(4):
        ny, nx = ny + dy[i], nx + dx[i]
        while True:
            tmp, board[ny][nx] = board[ny][nx], tmp
            if 1 <= ny + dy[i] <= r and 1 <= nx + dx[i] <= c:
                ny += dy[i]
                nx += dx[i]
            else: break
            if ny == y and nx == x: break
        i = (i + move) % 4

r, c, t = map(int,input().split())
board = [[0 for _ in range(c+1)] for _ in range(r+1)]
airCleaner = []
queue = deque()

for i in range(1,r+1):
    board[i][1:] = list(map(int,input().split()))
    if len(airCleaner) != 2:
        for j in range(1,c+1):
            if board[i][j] == -1: airCleaner.append((i,j))

for _ in range(t):
    initQ()
    spread(queue)
    cleaning(airCleaner[0],-1)
    cleaning(airCleaner[1],1)
    
answer = 0
for b in board:
    answer += sum(b)
print(answer + 2)