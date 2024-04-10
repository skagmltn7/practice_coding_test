import sys
from collections import deque
input = sys.stdin.readline

m,n,h = map(int,input().split())

ground=[]
unripe = 0
for _ in range(h):
    tmp=[]
    for _ in range(n):
        tmp.append(list(map(int,input().split())))
    ground.append(list(tmp))

queue=deque()
for z in range(h):
    for i in range(n):
        for j in range(m):
            if ground[z][i][j]==1:
                queue.append((z,i,j,0))
            if ground[z][i][j]==0:
                unripe+=1
if unripe==0: 
    print(0)
    exit(0)

visited = []
for _ in range(h):
    visited.append([[False for _ in range(m)]for _ in range(n)])

dir = [(0,-1,0),(0,0,1),(0,1,0),(0,0,-1),(1,0,0),(-1,0,0)]

while queue:
    nz, ny, nx, day = queue.popleft()
    for d in dir:
        ez, ey, ex = nz + d[0], ny + d[1], nx + d[2]
        if 0<=ez<h and 0<=ey<n and 0<= ex<m:
            if not visited[ez][ey][ex] and ground[ez][ey][ex]==0:
                visited[ez][ey][ex] = True
                ground[ez][ey][ex]==1
                unripe-=1
                if unripe==0:
                    print(day+1)
                    exit(0)
                queue.append((ez,ey,ex,day+1))
print(-1)
