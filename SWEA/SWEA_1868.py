"""
output: 최소 클릭 횟수
1. 아이디어
    - 8방향 *갯수세기
    - 0인애 찾기
    - 클릭하기
        - 0인 애들부터 클릭수
    - 남는 애들 갯수 + 클릭수
"""
from collections import deque

dir = (-1,0,1)

def chkBomb():
    global left
    zero = []
    for y in range(N):
        for x in range(N):
            if board[y][x] == '*': continue
            left += 1
            cnt = 0
            for i in range(3):
                for j in range(3):
                    ny, nx = y +dir[i], x + dir[j]
                    if ny==y and nx==x: continue
                    if 0 <= ny < N and 0 <= nx < N and board[ny][nx]=='*': 
                        cnt += 1
            cntBoard[y][x] = cnt
            if cnt==0: zero.append((y,x))
    return zero

def click(y,x):
    global left
    queue = deque()
    clicked[y][x] = True
    queue.append((y,x))
    left -= 1

    while queue:
        cury, curx = queue.popleft()
        for i in range(3):
            for j in range(3):
                ny, nx = cury +dir[i], curx + dir[j]
                if ny == cury and nx == curx: continue
                if 0 <= ny < N and 0 <= nx < N and not clicked[ny][nx] and board[ny][nx]=='.':
                    clicked[ny][nx] = True
                    left -= 1
                    if cntBoard[ny][nx] == 0: queue.append((ny,nx))

T = int(input())
for tc in range(1,T+1):
    N = int(input())
    board = [list(input()) for _ in range(N)]
    cntBoard = [['*' if board[i][j] == '*' else 0 for j in range(N)]for i in range(N)]

    left = 0
    zero = chkBomb()
    clicked = [[False for _ in range(N)]for _ in range(N)]
    answer = 0

    for plot in zero:
        y, x = plot
        if not clicked[y][x]:
            click(y,x)
            answer += 1

    answer += left
    print("#{} {}".format(tc,answer))