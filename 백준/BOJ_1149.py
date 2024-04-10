"""
1. 아이디어 
    -색칠하기
    1. 빨강을 칠하는 경우
    2. 초록을 칠하는 경우
    3. 파랑을 칠하는 경우
    조건: 인접한 집끼리는 같은 색X
    += min(arr[i-1][c],arr[i-1][c'])
2. 시간복잡도
1e3 O(n^2)
"""
import sys; input = sys.stdin.readline

n = int(input())
paint = []
for _ in range(n):
    paint.append(list(map(int,input().split())))

for i in range(1,n):
    paint[i][0]+=min(paint[i-1][1],paint[i-1][2])
    paint[i][1]+=min(paint[i-1][0],paint[i-1][2])
    paint[i][2]+=min(paint[i-1][0],paint[i-1][1])
    
print(min(paint[-1]))


