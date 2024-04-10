"""
1. 아이디어
    - 정점 연결
    bfs로 타고들어가면서 before이 부모노드
"""
import sys; input = sys.stdin.readline
from collections import deque, defaultdict

def bfs():
    parent = dict()
    visited = [False]*(n+1)
    visited[1] = True

    queue = deque()
    queue.append(1)

    while queue:
        cur = queue.popleft()
        for nxt in nodes[cur]:
            if not visited[nxt]:
                visited[nxt] = True
                parent[nxt] = cur
                queue.append(nxt)
    return parent

n = int(input())
nodes = defaultdict(list)
for _ in range(n-1):
    a, b = map(int,input().split())
    nodes[a].append(b)
    nodes[b].append(a)

parent = bfs()
for i in range(2,n+1):
    print(parent[i])