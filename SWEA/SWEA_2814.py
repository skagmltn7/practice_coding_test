"""
1.아이디어
output: 최장 경로의 길이
- 그래프 간선 그리기: defaultdict
- 이어진 간선 따라가기: dfs
"""
from collections import defaultdict

def dfs(node, visited, cnt):
    global answer

    if answer < cnt: answer = cnt

    for nxt_node in graph[node]:
        if not visited[nxt_node]:
            visited[nxt_node] = True
            dfs(nxt_node, visited, cnt + 1)
            visited[nxt_node] = False

T = int(input())
for tc in range(1, T + 1):
    n, m = map(int, input().split())
    graph = defaultdict(list)
    answer = 0
    if m==0: answer=1
    else:
        for _ in range(m):
            x, y = map(int, input().split())
            graph[x].append(y)
            graph[y].append(x)

        visited = [False] * (n + 1)
        visited[0] = True
        for node in range(1, n + 1):
            visited[node] = True
            dfs(node, visited, 1)
            visited[node] = False
    print('#{} {}'.format(tc, answer))

