"""
1. 아이디어
    - 중요도에 
"""
from collections import deque
from heapq import heappush,heappop
T = int(input())
for _ in range(T):
    heap = []
    waiting = deque()
    answer = 0 
    n,m = map(int,input().split())
    li = list(map(int,input().split()))
    
    for inx,p in enumerate(li): 
        heappush(heap,-p)
        waiting.append((p,inx))
    
    while heap:
        p = heappop(heap)*(-1)
        while waiting[0][0] != p:
            waiting.append(waiting.popleft())
        answer+=1
        inx = waiting.popleft()[1]
        if inx == m: break
    print(answer)
