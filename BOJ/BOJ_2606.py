"""
output: 웜바이러스가 걸리게 되는 컴퓨터의 수
1. 아이디어
    - 컴퓨터 연결 상태
        그래프 만들기(defaultdict으로)
    - 타고 들어가기
        bfs
    - 바이러스 걸린 컴퓨터의 수
        virus의 False세기
"""
import sys
from collections import defaultdict, deque
input = sys.stdin.readline

def infectionChk(computer):
    virus=[True]*(n+1)
    virus[computer]=False
    queue=deque()
    queue.append(computer)

    while queue:
        c = queue.popleft()
        for nxt in computers[c]:
            if virus[nxt]:
                virus[nxt] = False
                queue.append(nxt)
    return virus.count(False) - 1

n = int(input())
m = int(input())
computers = defaultdict(list)

for _ in range(m):
    a, b = map(int,input().split())
    computers[a].append(b)
    computers[b].append(a)

print(infectionChk(1))
