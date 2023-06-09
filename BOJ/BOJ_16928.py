"""
1. 아이디어
bfs
    - 주사위 not visited
        i < i+x (1<=x<=6)
    - 뱀/사다리 set검사 
    dict에 있으면 가기
    1에서 출발하여 주사위 돌려서 뱀/사다리 타고 100도달하기
"""
import sys; input = sys.stdin.readline
from collections import deque

n, m = map(int,input().split())
move = dict()
for _ in range(n+m):
    start,end = map(int,input().split())
    move[start]=end

chk = set(move.keys())

queue = deque()
visited = [False]*101

queue.append((1,0))
visited[1]=True

while queue:
    curr,cnt = queue.popleft()
    if curr == 100: 
        print(cnt)
        break
    for i in range(1,7):
        nxt = curr+i
        if 1<=nxt<=100 and not visited[nxt]:
            if nxt in chk:
                nxt = move[nxt]
            visited[nxt]=True
            queue.append((nxt,cnt+1))
