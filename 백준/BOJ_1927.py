import sys
from heapq import heappush,heappop
input = sys.stdin.readline

heap=[]
n = int(input())
for _ in range(n):
    x = int(input())
    if x==0: 
        if heap: print(heappop(heap))
        else: print(0)
    else: heappush(heap,x)