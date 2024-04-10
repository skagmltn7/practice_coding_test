"""
1. 아이디어
change in [2*a, 10*a+1]
if change > b: return
- nums[change] = min(nums[change],nums[a]+1)

"""
import sys; input = sys.stdin.readline
from heapq import heappush, heappop

def bfs():
    heap = []
    heappush(heap,(0,a))

    while heap:
        n, cur = heappop(heap)
        if cur == b: return n+1
        for nxt in [2*cur, 10*cur+1]:
            if a <= nxt <= b:
                heappush(heap,(n+1,nxt))
    return -1

a, b = map(int,input().split())
print(bfs())