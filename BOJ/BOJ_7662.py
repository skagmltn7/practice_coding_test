"""
1.아이디어
    -D
    if queue
        - n==1 최댓값
        - n == -1 최솟값
    -I넣기

    -출력
    if queue: 최댓값, 최솟값
    else: EMPTY
"""
import sys
from heapq import heappush, heappop
input = sys.stdin.readline

def dual(heap,chk):
    while heap and not visited[heap[0][1]]:
        heappop(heap)
    if heap and chk:
        visited[heap[0][1]]=False
        heappop(heap)
        
T = int(input())
for _ in range(T):
    max_heap, min_heap = [], []
    k = int(input())
    visited = [False]*k 
    for i in range(k):
        c, n = input().split()
        n=int(n)
        if c == "I": 
            heappush(min_heap,(n,i))
            heappush(max_heap,(-n,i))
            visited[i]=True
        else:
            if n == -1: dual(min_heap,1)
            else: dual(max_heap,1)
    dual(min_heap,0)
    dual(max_heap,0)
    if min_heap and max_heap: 
        print(-1*heappop(max_heap)[0],heappop(min_heap)[0])
    else: print("EMPTY")
