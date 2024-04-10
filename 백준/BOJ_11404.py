"""
플로이드-워셜

min(costs[cur],costs[before]+cost)
"""
import sys; input = sys.stdin.readline
n = int(input())
m = int(input())

costs = [[0 if i==j else float('inf') for j in range(n+1)] for i in range(n+1)]

for _ in range(m):
    a, b, cost = map(int,input().split())
    costs[a][b]=min(costs[a][b],cost)

for k in range(1,n+1):
    for i in range(1,n+1):
        for j in range(1,n+1):
            costs[i][j] = min(costs[i][j], costs[i][k]+costs[k][j])

for i in range(1,n+1):
    for j in range(1,n+1):
        if costs[i][j] == float('inf'): costs[i][j] = 0
        print(costs[i][j],end=' ')
    print()