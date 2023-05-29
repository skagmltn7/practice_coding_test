"""
output:
1. 아이디어
    1. 경우의 수
    bfs로 (sum,'0+0+0')검사하면서 sum==입력값이면 set에 넣기
"""
import sys
from collections import deque
input = sys.stdin.readline

def bfs(n,set):
    queue = deque()
    queue.append((0,''))

    while queue:
        sum, string = queue.popleft()
        if sum == n: 
            set.add(string)
            continue
        for i in range(1,4):
            if sum+i <= n: 
                if string: 
                    tmp = '+' + str(i)
                    queue.append((sum+i,string+tmp))
                else: 
                    queue.append((i,str(i)))

t = int(input())
for _ in range(t):
    n = int(input())
    chk = set()
    bfs(n,chk)
    print(len(chk))