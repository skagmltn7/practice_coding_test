"""
1.아이디어
output: 카드3장의 총합이 m을 넘지않고 가장 큰 값
    -카드 3장 선택하기
        dfs 
        고르면 체크 len3이면 멈추고 리턴 
    -가장 큰 값 고르기
2.시간복잡도
n=100=1e2 O(n^3)
"""
import sys
input=sys.stdin.readline
answer=0

def dfs(li,inx):
    global answer
    if len(li)==3:
        li_sum = sum(li)
        if li_sum <= m and answer < li_sum : answer = li_sum
        return 
    for i in range(inx+1,n):
        if  not visited[i]:
            visited[i]=True
            li.append(numbers[i])
            dfs(li,i)
            li.pop()
            visited[i]=False

n,m = map(int,input().split())
visited = [False]*n
numbers = list(map(int,input().split()))

for i,num in enumerate(numbers):
    visited[i]=True
    dfs([num],i)
print(answer)
