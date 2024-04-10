"""
1. 아이디어
    -add
        set.add(x)
    -empty
        set.clear()
    -all
        continue
    if x in set:
        if check: print(1)
        elif toggle: set-={x}
    else:
        if check:print(0)
        elif toggle: set.add(x)
"""
import sys
input = sys.stdin.readline

m = int(input())
s = set()
for _ in range(m):
    command = input().split()
    if command[0] == "all": 
        for i in range(1,21):
            s.add(i)
    elif command[0] == "empty":s.clear()
    else:
        x=int(command[1])
        if command[0]=="add": s.add(x)
        elif command[0]=="remove":s-={x}
        else:
            if x in s:
                if command[0] == "check": print(1)
                else: s-={x}
            else:
                if command[0] == "check": print(0)
                else: s.add(x)
