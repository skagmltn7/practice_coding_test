"""
1. 아이디어
if len(li)==m print(li)
from i to n
"""
import sys; input = sys.stdin.readline

def dfs(num,li):
    if len(li)==m: 
        print(' '.join(map(str,li)))
        return
    for i in range(num,n+1):
        li.append(i)
        dfs(i,li)
        li.pop()
    
n, m = map(int,input().split())
dfs(1,[])   