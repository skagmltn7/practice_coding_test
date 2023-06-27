"""
output: 왕복 오래걸리는 학생이 걸린 시간
1. 아이디어
    -학생별 
        - n -> x d
        - x -> n
    - 왕복 오래걸리는 학생찾기 
        max(출발[최단시간의 마을] + 도착[최단시간의 마을])

2. 시간복잡도
n = 1e3 O(n^2logn)
"""
import sys; input = sys.stdin.readline
from collections import defaultdict
from heapq import heappush, heappop

def findRoundTripTime(student):
    distance = [float('inf')] * (n+1)
    heap = []
    distance[student] = 0
    heappush(heap,(0,student))

    while heap:
        cost, cur = heappop(heap)
        if distance[cur] < cost: continue
        for nxt, t in towns[cur]:
            d = t + cost
            if distance[nxt] > d:
                distance[nxt] = d
                heappush(heap,(d,nxt))

    return distance

n, m, x = map(int,input().split())
towns = defaultdict(list)

for _ in range(m):
    a, b, cost = map(int,input().split())
    towns[a].append((b,cost))

dist = [[float('inf') for _ in range(n+1)] for _ in range(n+1)]

for i in range(1,n+1):
    dist[i] = findRoundTripTime(i)

answer = 0
for i in range(1,n+1):
    answer = max(answer, dist[i][x] + dist[x][i])
print(answer)