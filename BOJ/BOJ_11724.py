"""
output: 연결요소 개수
1. 아이디어
    - 간선 연결
    - 그룹핑
    남은 정점갯수 n으로 체크 
    if n==0 break
"""
import sys
from collections import defaultdict, deque
input = sys.stdin.readline

def bfs(node):
    global n
    queue = deque()
    visited[node] = True
    queue.append(node)
    
    while queue:
        v = queue.popleft()
        for u in edges[v]:
            if not visited[u]:
                visited[u] = True
                queue.append(u)
                n -= 1
        if n==0: return False
    return True

n, m =map(int,input().split())
edges = defaultdict(list)

for _ in range(m):
    u,v = map(int,input().split())
    edges[u].append(v)
    edges[v].append(u)

visited = [False]*(n+1)
connected = 0


for i in range(1,n+1):
    if not visited[i]:
        connected+=1
        if not bfs(i): break
print(connected)