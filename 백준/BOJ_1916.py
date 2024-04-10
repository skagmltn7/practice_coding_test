"""
1. 아이디어
- 연결
    - 버스비용
        min cost
- 다익스트라
"""
import sys; input = sys.stdin.readline
from collections import defaultdict
from heapq import heappush, heappop

def bfs():
    min_cost[departure] = 0
    heap = []
    heappush(heap,(0,departure))
    
    while heap:
        dist, curr = heappop(heap)
        if min_cost[curr] < dist: continue
        for nxt in buses[curr]:
            d = dist + cost[curr][nxt]
            if d < min_cost[nxt]:
                min_cost[nxt] = d
                heappush(heap,(d,nxt))

n= int(input())
m = int(input())
cost = [[float('inf') for _ in range(n+1)]for _ in range(n+1)]
buses = defaultdict(set)

for _ in range(m):
    s, e, fee = map(int,input().split())
    buses[s].add(e)
    if fee < cost[s][e]: cost[s][e] = fee

departure, arrival = map(int,input().split())

min_cost = [float('inf')] * (n+1)
bfs()
print(min_cost[arrival])
