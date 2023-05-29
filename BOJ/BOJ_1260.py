import sys
from collections import defaultdict,deque

def dfs(v):
    visited[v] = True
    print(v, end = ' ')

    for e in edges[v]:
        if not visited[e]:
            dfs(e)

def bfs(v):
    queue=deque()
    visited = [False] * (n+1)
    visited[v] = True
    queue.append(v)

    while queue:
        nxt = queue.popleft()
        print(nxt, end=' ')
        for e in edges[nxt]:
            if not visited[e]:
                visited[e] = True
                queue.append(e)

input = sys.stdin.readline

n, m, v = map(int,input().split())
edges=defaultdict(list)

for _ in range(m):
    x,y = map(int,input().split())
    edges[x].append(y)
    edges[y].append(x)

for e in edges.keys(): edges[e] = sorted(edges[e])

visited = [False] * (n+1)
dfs(v)
print()
bfs(v)
