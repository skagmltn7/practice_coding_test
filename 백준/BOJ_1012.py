"""
output: 필요한 최소의 배추지렁이 수
1. 아이디어
    - 배추인지 검사
        배추있으면 배추범위 검사

    - 배추범위검사(bfs)
        상하좌우
        끝이면 해당 범위에서 배추갯수 
"""
import sys
from collections import deque
input = sys.stdin.readline

def bfs(y,x):
    cnt = 1
    queue = deque()
    queue.append((y,x))
    visited[y][x] = True

    while queue:
        ny,nx = queue.popleft()
        for i in range(4):
            ey, ex = ny + dy[i], nx + dx[i]
            if 0<=ey<n and 0<=ex<m:
                if ground[ey][ex]==1 and not visited[ey][ex]:
                    visited[ey][ex]=True
                    queue.append((ey,ex))
                    cnt+=1
    return cnt
T = int(input())
for _ in range(T):
    # 가로,세로,배추가 심어져있는 위치의 개수
    m, n, k = map(int,input().split()) 
    ground = [[0 for _ in range(m)]for _ in range(n)]
    for _ in range(k): 
        x,y = map(int,input().split())
        ground[y][x]=1

    visited = [[False for _ in range(m)]for _ in range(n)]
    dy = (-1,0,1,0)
    dx = (0,1,0,-1)
    answer=0
    chk=0
    for i in range(n):
        for j in range(m):
            if not visited[i][j] and ground[i][j]==1:
                k -= bfs(i,j)
                answer+=1
            if k==0: 
                chk=1
                break
        if chk: break
    print(answer)

