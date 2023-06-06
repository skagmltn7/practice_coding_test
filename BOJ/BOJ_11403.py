"""
1. 아이디어
    - 간선 표시
        자기 자신은 무조건 1
    - 그래프 탐색
        플루이드-워셜
"""
import sys; input = sys.stdin.readline
n = int(input())
graph = []
for _ in range(n):
    graph.append(list(map(int,input().split())))

for k in range(n):
    for i in range(n):
        for j in range(n):
            if graph[i][k]==1 and graph[k][j]==1:
                graph[i][j]=1
for g in graph:
    print(' '.join(map(str,g)))