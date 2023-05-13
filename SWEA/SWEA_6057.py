"""
1. 아이디어
    output: 삼각형의 개수
    i는 1부터시작,i j k 간선, 중복x
    1. 간선표시 -> O(m) +
    2. inx마다 -> O(n) *
    3. i->j->k->i: dfs -> O(n-1)
    
2. 시간복잡도
    n = 50, m=n**2+C
    O(n**2+m) = O(2*n**2) = 5e3
"""
from collections import defaultdict
def dfs(inx,li):
    global answer
    for nxt_node in graph[inx]:
        if len(li)<3:
            if inx<nxt_node:
                li.append(nxt_node)
                dfs(nxt_node,li)
                li.pop()
        else:
            if li[0]==nxt_node: answer+=1
                
T=int(input())
for test_case in range(1,T+1):
    n,m=map(int,input().split())
    graph=defaultdict(list)
    answer=0
    for _ in range(m):
        x,y = map(int,input().split())
        graph[x].append(y)
        graph[y].append(x)
    for i in range(1,n+1): dfs(i,[i])
    print('#'+str(test_case)+' '+str(answer))