"""
1. 아이디어
    - 입력어 처리
        - push
            - push_front: insert(n,0)
            - push_back: append
        - size
        - queue O
            -empty: 0
            -pop_front: popleft
            -pop_back: pop
            -front:queue[0]
            -back:queue[-1]
        - queue X
            -empty: 1
            else: -1
            
"""
import sys
from collections import deque
input = sys.stdin.readline

queue=deque()
n = int(input())

for _ in range(n):
    command = input().split()
    
    if command[0] == 'push_front': queue.insert(0,int(command[1]))
    elif command[0] == 'push_back': queue.append(int(command[1]))
    elif command[0] == 'size': print(len(queue))
    else:
        if queue:
            if command[0] == 'pop_front': print(queue.popleft())
            elif command[0] == 'pop_back': print(queue.pop())
            elif command[0] == 'front': print(queue[0])
            elif command[0] == 'back': print(queue[-1])
            else: print(0)
        else:
            if command[0] == 'empty': print(1)
            else: print('-1')
