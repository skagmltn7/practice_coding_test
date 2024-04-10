"""
1. 아이디어
bfs
    -걷기
    -순간이동
    heap으로 가장 빠른 시간부터 처리하도록
2. 시간복잡도
n = 1e5 O(nlgn)
"""
import sys; input = sys.stdin.readline
from heapq import heappush,heappop

def bfs():
    move[n] = 0
    heap = []
    heappush(heap,(0, n))
    
    while heap:
        cnt, cur = heappop(heap)
        if cur == k: 
            print(cnt)
            return
        for opt, c in [(cur+1,1), (cur-1,1), (2*cur,0)]:
            if 0 <= opt <= 100000:
                clock = cnt + c
                if move[opt] > clock:
                    move[opt] = clock
                    heappush(heap,(clock,opt))

n, k = map(int,input().split())
move = [float('inf')] * 100001
bfs()