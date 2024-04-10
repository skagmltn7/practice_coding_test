"""
1. 아이디어
    - 도연이 위치(I)
    - 이동
        bfs
        x면 이동X
        P면 cnt++
    - 출력  
        0명일 경우 TT
"""
import sys; input = sys.stdin.readline
from collections import deque

def move(doyeon):
    dy = (-1,0,1,0)
    dx = (0,1,0,-1)
    y,x = doyeon
    queue = deque()
    visited = [[False for _ in range(m)]for _ in range(n)]
    people = 0

    queue.append((y,x))
    visited[y][x]=True

    while queue:
        curry, currx = queue.popleft()
        for i in range(4):
            ny, nx = curry + dy[i], currx + dx[i]
            if 0<=ny<n and 0<=nx<m and not visited[ny][nx] and campus[ny][nx]!='X':
                if campus[ny][nx]=='P': 
                    people+=1
                visited[ny][nx]=True
                queue.append((ny,nx))

    if people==0: return "TT"
    return people


n, m = map(int,input().split())

doyeon =[0,0]
campus = []
for i in range(n):
    campus.append(input().rstrip())
    if 'I' in campus[-1]: doyeon = [i,campus[-1].index('I')]

print(move(doyeon))


