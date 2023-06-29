"""
1. 아이디어
출력하는 수열 set에 넣어 중복검사하기
"""
import sys; input = sys.stdin.readline
sys.setrecursionlimit(10**6)
n, m = map(int,input().split())
arr = sorted(list(map(int,input().split())))

chk = set()
visited = [False]*n

def dfs(li):
    if len(li) == m:
        if tuple(li) not in chk:
            chk.add(tuple(li))
            print(' '.join(map(str,li)))
        return
    for i in range(n):
        if not visited[i]:
            visited[i] = True
            li.append(arr[i])
            dfs(li)
            li.pop()
            visited[i] = False

for i in range(n):
    visited[i] = True
    dfs([arr[i]])
    visited[i] = False