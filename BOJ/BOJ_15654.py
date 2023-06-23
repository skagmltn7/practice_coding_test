"""
1. 아이디어
    - input sort
    - 조합(dfs)
    - cnt == m이면 print
"""
import sys; input = sys.stdin.readline
sys.setrecursionlimit(10**6)
n, m = map(int,input().split())
li = sorted(list(map(int,input().split())))
visited = [False] * n

def dfs(arr, cnt):
    if cnt == m:
        print(' '.join(map(str,arr)))
        return
    for inx in range(n):
        if not visited[inx]:
            visited[inx] = True
            arr.append(li[inx])
            dfs(arr,cnt+1)
            visited[inx] = False
            arr.pop()
dfs([],0)