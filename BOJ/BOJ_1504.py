"""
output: 두 개의 정점을 지나는 최단 경로의 길이 출력, 없으면 -1
1. 아이디어
    - 방향성 없는 그래프
        defaultdict
    - 1번에서 n번 최단거리
        다익스트라(heap)
        - 두 정점 반드시 통과
            1) start -> v1 -> v2 -> end
                dist[start][v1], dist[v1][v2],dist[v2][end]
            2) start -> v2 -> v1 -> end
                dist[start][v2], dist[v2][v1],dist[v1][end]
2. 시간복잡도
n = 8e2 e= 2e5 O(ne)
"""
import sys; input = sys.stdin.readline
from collections import defaultdict
from heapq import heappush, heappop

def Dijk(start):
    dist = [float('inf')] * (n+1)
    dist[start] = 0
    heap = []
    heappush(heap,(0,start))

    while heap:
        d, cur = heappop(heap)
        if dist[cur] < d: continue
        for nxt, cost in graph[cur]:
            distance = cost + d
            if distance < dist[nxt]:
                dist[nxt] = distance
                heappush(heap,(distance,nxt))
    return dist

n, e = map(int,input().split())
graph = defaultdict(list)

for _ in range(e):
    a, b, c = map(int,input().split())
    graph[a].append((b,c))
    graph[b].append((a,c))

v1, v2= map(int,input().split())

startDijk = Dijk(1)
start2v1 = startDijk[v1]
start2v2 = startDijk[v2]

nodeDijk = Dijk(v1)
v12v2 = nodeDijk[v2]
v12end = nodeDijk[n]

v2Dijk = Dijk(v2)
v22end = v2Dijk[n]

answer = min((start2v1 + v12v2 + v22end), (start2v2 + v12v2 + v12end))
print(answer if answer != float('inf') else -1)

