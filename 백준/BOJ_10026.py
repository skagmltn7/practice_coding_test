"""
output: 적록색약인 사람이 봤을때 / 아닌사람일때 구역의 수
1. 아이디어
    구역찾기
    -방문안했으면 bfs
        color별로 상하좌우 검사 (아닌 사람)
        color가 B(적록색약사람)
"""
import sys
from collections import deque
input = sys.stdin.readline

def chk(color,have,y,x):
    if have:
          if not visited_have[y][x]:
            if (color!='B' and grid[y][x]!='B') or (color=='B' and grid[y][x]=='B'): 
               visited_have[y][x]=True
               return True
    else:
       if not visited[y][x] and grid[y][x]==color: 
         visited[y][x]=True
         return True
    return False

def bfs(y,x,color,have):
   queue = deque()
   queue.append((y,x))

   while queue:
      ny,nx = queue.popleft()
      for i in range(4):
        ey,ex = ny + dy[i], nx + dx[i]
        if 0<=ey<n and 0<=ex<n:
           if chk(color,have,ey,ex):
               queue.append((ey,ex))
      
n = int(input())
grid = []
for _ in range(n):
   grid.append(input().rstrip())

dy = (-1,0,1,0)
dx = (0,1,0,-1)

visited_have = [[False for _ in range(n)]for _ in range(n)]
visited = [[False for _ in range(n)]for _ in range(n)]

answer=[0,0]
for i in range(n):
   for j in range(n):
      color = grid[i][j]
      
      if not visited[i][j]:
        visited[i][j]=True
        answer[0]+=1
        bfs(i,j,color,False)
        
      if not visited_have[i][j]:
         visited_have[i][j]=True
         answer[1]+=1
         bfs(i,j,color,True)
print(answer[0],answer[1])