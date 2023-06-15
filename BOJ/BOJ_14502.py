"""
1. 아이디어
    - 벽 세우기
    combination으로 0인 좌표에 벽쌓기
    - 바이러스 퍼트리기
    - 안전지대 수 세기
"""
import sys; input = sys.stdin.readline
import copy
from itertools import combinations
from collections import deque

def makeWall():
    for combi in combinations(empty,3):
        for c in combi:
            y,x = c
            board[y][x]=1
        bfs()
        for c in combi:
            y,x = c
            board[y][x]=0

dy = (-1,0,1,0)
dx = (0,1,0,-1)

def bfs():
    global answer
    virus_spread = copy.deepcopy(board)
    queue = deque()
    visited = [[False for _ in range(m)]for _ in range(n)]

    for v in virus:
        queue.append(v)
        visited[v[0]][v[1]]=True
    cnt = 0
    while queue:
        cury, curx = queue.popleft()
        for i in range(4):
            ny, nx = cury + dy[i], curx + dx[i]
            if 0 <= ny < n and 0 <= nx < m and not visited[ny][nx] and  virus_spread[ny][nx] == 0:
                visited[ny][nx] = True
                virus_spread[ny][nx] = 2
                cnt+=1
                queue.append((ny,nx))
    
    answer = max(answer, wallNum-cnt)
n, m = map(int,input().split())

board = []
for _ in range(n):
    board.append(list(map(int,input().split())))

empty = [(i,j) for j in range(m) for i in range(n) if board[i][j]==0]
virus = [(i,j) for j in range(m) for i in range(n) if board[i][j]==2]
wallNum = len(empty)-3
answer = 0
makeWall()
print(answer)