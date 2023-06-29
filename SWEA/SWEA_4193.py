"""
최소 시간
1. 아이디어
    - 소용돌이
    초%3==0이면 갈 수 있음
    - 이동
    소용돌이나 장애물일경우 이동x
    도착지면 return clock
"""
from heapq import heappush, heappop
dy = (-1,0,1,0)
dx = (0,1,0,-1)

def bfs(start, dest, n):
    y, x = start
    destY, destX = dest
    visited = [[False for _ in range(n)]for _ in range(n)]
    heap = []
    
    visited[y][x] = True
    heappush(heap,(0,y,x))

    while heap:
        clock, curY, curX = heappop(heap)
        if curY == destY and curX == destX:
            return clock
        for i in range(4):
            ny, nx = curY + dy[i], curX + dx[i]
            if 0 <= ny < n and 0 <= nx <n and pool[ny][nx] != 1:
                if not visited[ny][nx]:
                    visited[ny][nx] = True
                    nxtClock = clock
                    if pool[ny][nx] == 2:
                        while nxtClock % 3 != 2:
                            nxtClock +=1
                    heappush(heap,(nxtClock+1,ny,nx))
    return -1

T = int(input())
for tc in range(1, T+1):
    n = int(input())
    pool = [list(map(int,input().split())) for _ in range(n)]
    start = tuple(map(int,input().split()))
    dest = tuple(map(int,input().split()))

    print("#{} {}".format(tc,bfs(start,dest,n)))