"""
1.아이디어
    - 친분잇기
    - 워셜
"""
import sys; input = sys.stdin.readline
n, m = map(int,input().split())

friend = [[float('inf') for _ in range(n+1)]for _ in range(n+1)]

for _ in range(m):
    a, b = map(int,input().split())
    friend[a][b]=1
    friend[b][a]=1

for k in range(1,n+1):
    friend[k][k]=0
    for i in range(1, n+1):
        for j in range(1, n+1):
            friend[i][j]=min(friend[i][j],friend[i][k]+friend[k][j])
answer =[]

for i in range(1,n+1):
    answer.append((i,sum(friend[i][1:])))
answer.sort(key=lambda x: (x[1],x[0]))
print(answer[0][0])