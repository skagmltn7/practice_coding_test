"""
1. 아이디어
    - 바둑판 자르기
        0~len()-8 + 1
    - 바둑판 틀린 보드 갯수 세기(bfs)
        - 처음시작이 black일때
        - 처음시작이 white일때
"""
from collections import deque

dy = (1,0,-1,0)
dx = (0,1,0,-1)

def board_chk(y,x,color):
    chk = [[False for _ in range(m)]for _ in range(n)]
    queue=deque()
    queue.append((y,x,color))
    chk[y][x]=True

    if board[y][x]==color: cnt=0
    else: cnt=1
    
    while queue:
        nxt_y,nxt_x,nxt_c = queue.popleft()
        for i in range(4):
            ny,nx = nxt_y + dy[i], nxt_x + dx[i]
            if y<=ny<y+8 and x<=nx<x+8:
                if not chk[ny][nx]:
                    chk[ny][nx]=True
                    if nxt_c=='B': c='W'
                    else: c='B'
                    if board[ny][nx]!=c: cnt+=1
                    queue.append((ny,nx,c))
    return cnt

n,m = map(int,input().split()) #세로, 가로
board=[]
for _ in range(n):
    board.append(input())

answer=float('inf')
for i in range(n-7):
    for j in range(m-7):
        cnt1 = board_chk(i,j,'B')
        cnt2 = board_chk(i,j,'W')
        answer=min(answer,cnt1,cnt2)
print(answer)
