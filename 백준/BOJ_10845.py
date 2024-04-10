from collections import deque
import sys
input = sys.stdin.readline
n = int(input())
queue=deque()
for _ in range(n):
    command = input().split()
    if command[0]=='push':
        queue.append(int(command[1]))
    elif command[0]=='size':
        print(len(queue))
    else:
        if queue:
            if command[0]=='pop': print(queue.popleft())
            elif command[0]=='front':print(queue[0])
            elif command[0]=='back': print(queue[-1])
            else: print(0)
        else:
            if command[0]=='empty': print(1)
            else: print(-1)