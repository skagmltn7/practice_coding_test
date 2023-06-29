"""
output : 트리의 지름 출력
1. 아이디어
    - 양방향 그래프
    - 루트에서 가장 먼 노드찾기
    - 루트에서 가장 먼 노드에서 가장 먼 노드까지의 길이 구하기
2. 시간복잡도
N = 1e4 O(N*2)
"""
import sys; input = sys.stdin.readline
from collections import defaultdict
sys.setrecursionlimit(10**6)

def dfs(start, total):
    global answer, node
    if answer < total: 
        answer = total
        node = start
    for nxt, weight in tree[start]:
        if not visited[nxt]:
            visited[nxt] = True
            dfs(nxt,total+weight)
            visited[nxt] = False

n = int(input())
tree = defaultdict(list)

for _ in range(n-1):
    p, c, w = map(int,input().split())
    tree[p].append((c,w))
    tree[c].append((p,w))

answer, node = -1, 0
visited = [False] * (n+1)
visited[1] = True
dfs(1,0)

visited = [False] * (n+1)
visited[node] = True
dfs(node,0)
print(answer)