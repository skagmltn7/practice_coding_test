"""
1. 아이디어
    - 그래프그리기
    - 시작점에서 최단 경로 찾기
    dist[i] = min(dist[i],dist[j]+w)
"""
import sys; input = sys.stdin.readline
from collections import defaultdict
from heapq import heappush, heappop

def findDist(start):
    queue = []
    heappush(queue,(0,start))

    while queue:
        weight, v = heappop(queue)
        if dist[v] < weight: continue

        for nxtVal in graph[v]:
            nxtNode, nxtWeight = nxtVal
            d = dist[v] + nxtWeight
            if d < dist[nxtNode]: 
                dist[nxtNode] = d
                heappush(queue,(d,nxtNode))

V, E = map(int,input().split())
k = int(input())

graph = defaultdict(list)
for _ in range(E):
    u, v, w = map(int,input().split())
    graph[u].append((v,w))

dist = [float('inf')]*(V+1)
dist[k] = 0

findDist(k)
for d in dist[1:]:
    if d == float('inf'): print("INF")
    else: print(d)