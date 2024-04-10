"""
1. 아이디어
    - 배열 비내림차순
    - 부분수열 만들기
        - 사이즈 == m이면 출력
        - 중복된 부분수열있는지 체크
        - 없으면 요소 추가
"""
import sys; input = sys.stdin.readline
n, m = map(int,input().split())
arr = sorted(list(map(int,input().split())))
tmp = []
chk = set()

def isDuplicate(li):
    if li not in chk: 
        chk.add(li)
        return True
    return False

def dfs(inx):
    if len(tmp) == m:
        print(' '.join(map(str,tmp)))
        return
    for i in range(inx,n):
        tmp.append(arr[i])
        if isDuplicate(tuple(tmp)):
            dfs(i)
        tmp.pop()
dfs(0)
