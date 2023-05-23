"""
1. 아이디어
    - 명령어 처리
        - push : command[1] 정수처리하고 스택에 넣기
        - pop : 스텍pop하고 출력/ 없으면 -1
        - size : 스텍 길이 출력
        - empty : 스택 비어있으면 1, 아니면 0 출력
        - top : 스텍[-1]출력 / 없으면 -1출력
1e5 O(nlogn)
"""

import sys

input=sys.stdin.readline

stack=[]
N = int(input())
for _ in range(N):
    command = input().split()
    if command[0]=='push': 
        stack.append(int(command[1]))
    elif command[0]=='size': 
        print(len(stack))
    else:
        if stack:
            if command[0] == 'pop': print(stack.pop())
            elif command[0] == 'empty': print(0)
            else: print(stack[-1])
        else:
            if command[0] == 'empty': print(1)
            else: print(-1)

