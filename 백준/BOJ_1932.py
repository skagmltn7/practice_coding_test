"""
1. 아이디어
    대각선 오른쪽, 대각선 왼쪽 값 선택하여 최대 값 
    -(i,0)-> (i-1,0)만
    -(i,i)-> (i-1,i-1)만
    - max(i-1,i-1), (i-1,i)
"""
import sys; input = sys.stdin.readline
n = int(input())
arr=[]
for _ in range(n):
    arr.append(list(map(int,input().split())))

for i in range(1,n):
    for j in range(i+1):
        if j==0:
            arr[i][j]+=arr[i-1][j]
        elif i==j :
            arr[i][j]+=arr[i-1][j-1]
        else:
            arr[i][j]+=max(arr[i-1][j-1],arr[i-1][j])
print(max(arr[-1]))