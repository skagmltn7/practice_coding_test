"""
1. 아이디어
bfs 최소 힙사용
    - x-1, x+1 2*x넣기
    if pop값이 min이면 끝 
    if min값이 있고 다음에 pop한 값이 크면 종료  같으면 k인지 확인 cnt++
"""
import sys

input = sys.stdin.readline
from heapq import heappush, heappop

N, K = map(int, input().split())
answer = -1
cnt = 0


def bfs():
    global answer, cnt
    queue = []
    visited = [False] * (100001)
    queue.append((0, N))
    visited[N] = True

    while queue:
        time, cur = heappop(queue)
        if answer != -1 and time > answer:
            return
        if cur == K:
            answer = time
            cnt += 1
            continue
        visited[cur] = True
        for nxt in [cur + 1, cur - 1, 2 * cur]:
            if 0 <= nxt < 100001 and not visited[nxt]:
                heappush(queue, (time + 1, nxt))


bfs()
print(answer)
print(cnt)
