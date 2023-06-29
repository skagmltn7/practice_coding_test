"""
1. 아이디어
- 양방향 그래프 그리기
    arr[i] == -1 break
- 트리의 지름구하기
    임의의 점 하나 골라서 가장 먼 노드찾기
    가장 먼 노드에서 또 가장 먼 노드까지의 거리구하기
"""
import sys; input = sys.stdin.readline
from collections import defaultdict
sys.setrecursionlimit(10**6)

v = int(input())
tree = defaultdict(list)

for _ in range(v):
    arr = list(map(int,input().split()))
    node = arr[0]
    i = 1
    while arr[i] != -1:
        tree[node].append((arr[i],arr[i+1]))
        i += 2

def dfs(cur, total):
    global answer, start
    if answer < total:
        answer = total
        start = cur
    for nxt, weight in tree[cur]:
        if not visited[nxt]:
            visited[nxt] = True
            dfs(nxt,total+weight)
            visited[nxt] = False

answer, start = -1, 0
visited = [False]*(v+1)
visited[1] = True
dfs(1,0)

visited = [False]*(v+1)
visited[start] = True
dfs(start,0)
print(answer)

