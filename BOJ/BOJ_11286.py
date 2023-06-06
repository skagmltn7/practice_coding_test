"""
1. 아이디어
    -절대값 힙
    (abs(x),x)
    print(x)
"""
import sys; input = sys.stdin.readline
from heapq import heappush, heappop
n = int(input())
heap = []

for _ in range(n):
    x = int(input())
    if x==0:
        if heap: print(heappop(heap)[1])
        else: print(0)
    else:
        heappush(heap,(abs(x),x))