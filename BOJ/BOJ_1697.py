"""
output:  동생을 찾을 수 있는 가장 빠른 시간
- 아이디어:
    x-1 or x+1 or 2*x
     범위. 0<= x <= 100000
     동생만나면 끝
    bfs
"""
import sys
from collections import deque
input = sys.stdin.readline

n, k = map(int,input().split())
queue = deque()
visited = [False]*(100001)
queue.append((n,0))
visited[n]=True

while queue:
    nxt, cnt = queue.popleft()
    if nxt == k: break
    for dx in [nxt-1,nxt+1,2*nxt]:
        if 0<= dx <= 100000 and not visited[dx]:
            visited[dx]=True
            queue.append((dx,cnt+1))
print(cnt)