"""
output: 모든 토마토가 익는 최소 일수
1. 아이디어
    - 안익은 토마토의 갯수 세기
        0개: 0

    - 1이면 상하좌우검사해서 안익은 토마토 익게바꾸고 안익은 토마토 -1 day+=1 queue넣기
    - 익을 수 없는 토마토있는지 검사
    있으면 -1 없으면 day
    
"""
import sys
from collections import deque
input = sys.stdin.readline
             
m,n = map(int,input().split())
ground=[]
unripe = 0
for _ in range(n):
    ground.append(list(map(int,input().split())))
    unripe += ground[-1].count(0)

if unripe == 0 : print(0)
else:
    dy = (-1,0,1,0)
    dx = (0,1,0,-1)
    queue = deque()
    
    for y in range(n):
        for x in range(m):
            if ground[y][x]==1:
                queue.append((0,y,x))
    
    while queue:
        day,ny,nx = queue.popleft()
        for i in range(4):
            ey,ex = ny+dy[i], nx+dx[i]
            if 0<=ey<n and 0<=ex<m:
                if ground[ey][ex]==0:
                    unripe -=1
                    if unripe == 0:
                        print(day+1)
                        exit(0)
                    ground[ey][ex]=1
                    queue.append((day+1,ey,ex))
    print(-1)