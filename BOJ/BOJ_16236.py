"""
1. 아이디어
    - 아기상어 위치
    - 물고기 갯수
    - 찾는 조건
        아기상어보다 작은 사이즈물고기 수 세기
    - 먹을 물고기 찾기(bfs)
        - 이동 0이거나 아기상어사이즈거나
        - 먹을 물고기 체크(사이즈 체크)
            != 0 and < 아기 상어
            거리가 가장 가까운 -> 가장 위 -> 가장 왼쪽
    - 먹기
    - 아기상어 크기 체크
        - true면 사이즈물고기 +하기

"""
import sys; input = sys.stdin.readline
from collections import deque
from heapq import heappush, heappop

class Baby:
    def __init__(self) -> None:
        self.y = 0
        self.x = 0
        self.size = 2
        self.eatCnt = 0

    def setLocation(self,y, x):
        self.y = y
        self.x = x
            
dy = (-1,0,1,0)
dx = (0,1,0,-1)

def findEatable():
    visited = [[False for _ in range(n)] for _ in range(n)]
    queue = deque()
    queue.append((baby.y,baby.x,0))
    visited[baby.y][baby.x] = True
    target = []

    while queue:
        y,x,dist = queue.popleft()
        if 0 < board[y][x] < baby.size:
            heappush(target,(dist,y,x))
            continue
        for i in range(4):
            ny, nx = y + dy[i], x + dx[i]
            if 0 <= ny < n and 0 <= nx < n and not visited[ny][nx]:
                if board[ny][nx] <= baby.size:
                    visited[ny][nx] = True
                    queue.append((ny,nx,dist+1))
    if target: return heappop(target)
    return None

def eatFish(y,x):
    global eatableNum
    board[y][x] = 0
    eatableNum -= 1
    baby.eatCnt += 1
    baby.setLocation(y,x)

def sizeChk():
    global eatableNum
    if baby.eatCnt == baby.size:
        if baby.size <= 6: eatableNum += fishes[baby.size]
        baby.size += 1
        baby.eatCnt = 0



clock = 0
eatableNum = 0
eatableNum += fishes[1]

while eatableNum:
    tmp = findEatable()
    if not tmp: break
    move, targetY, targetX = tmp
    eatFish(targetY,targetX)
    clock += move
    sizeChk()

print(clock)