import sys; input = sys.stdin.readline
from collections import deque, defaultdict

def bfs(node):
    global visited
    queue = deque()
    queue.append(node)
    visited[node] = True

    while queue:
        cur = queue.popleft()
        for nxt in graph[cur]:
            if not visited[nxt]:
                visited[nxt] = True
                queue.append(nxt)

T = int(input())
for tc in range(1, T+1):
    n, m = map(int,input().split())
    graph = defaultdict(list)

    for _ in range(m):
        u, v = map(int,input().split())
        graph[u].append(v)
        graph[v].append(u)

    visited = [False] * (n+1)
    answer = 0
    for i in range(1,n+1):
        if not visited[i]:
            answer += 1
            bfs(i)
    print('#{} {}'.format(tc,answer))