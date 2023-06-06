"""
1. 아이디어
    - 함수
        deque
        - R 뒤집기
            chk반대
        - D 
            not chk:popleft
            chk:pop
    - 배열
    - 에러처리

2. 시간복잡도
p = 1e5, n=1e5
"""
import sys; input = sys.stdin.readline
from collections import deque

def printArr(arr,p):
    chk = False
    for c in p:
        if c=='R': chk = not chk
        else: 
            if not arr: 
                return print('error')
                
            if not chk: arr.popleft()
            else: arr.pop()
    
    arr = list(arr)
    if chk: arr = arr[::-1]

    print('['+','.join(map(str,arr))+']')

T = int(input())
for _ in range(T):
    p = input().rstrip()
    n = int(input())
    arr = input().rstrip()

    if n==0: arr = []
    else: arr = deque(map(int,arr[1:-1].split(',')))
    
    printArr(arr,p)


