"""
output: 단지수 출력, 단지별로 속하는 집의 수 오름차순
1. 아이디어
    -1찾기(bfs)
        상하좌우확인
        범위 내 인지
        방문한 곳인지 체크 && 1인지
            방문했고 cnt++
"""
import sys
from collections import deque
input = sys.stdin.readline

dy = (-1,0,1,0)
dx = (0,1,0,-1)

def bfs(y,x,cnt):
    queue = deque()
    queue.append((y,x))
    while queue:
        cury, curx = queue.popleft()
        for i in range(4):
            ny,nx = cury+dy[i],curx+dx[i]
            if 0<=ny<n and 0<=nx<n:
                if board[ny][nx]==1 and not visited[ny][nx]:
                    visited[ny][nx]=True
                    cnt+=1
                    queue.append((ny,nx))
    return cnt

n = int(input())
board=[]
for _ in range(n):
    board.append(list(map(int,list(input().rstrip()))))

visited = [[False for _ in range(n)]for _ in range(n)]
answer=[]

for i in range(n):
    for j in range(n):
        if board[i][j]==1 and not visited[i][j]:
            visited[i][j]=True
            answer.append(bfs(i,j,1))
answer.sort()
print(len(answer))
for n in answer: print(n)