import sys
from heapq import heappop, heappush
input = sys.stdin.readline

heap=[]
n = int(input())
for _ in range(n):
    x = int(input())
    if x==0:
        if heap: print(-1*heappop(heap))
        else: print(0)
    else:
        heappush(heap,-x)
