import sys; input = sys.stdin.readline
from collections import deque
T = int(input())

def D(num):
    return [(2 * num) % 10000,'D']

def S(num):
    return [(num - 1) % 10000,'S']

def L(num):
    d = num//1000
    num %= 1000
    return [num * 10 + d,'L']

def R(num):
    d = num%10
    num//=10
    return [d * 1000 + num, 'R']

for _ in range(T):
    a, b = map(int,input().split())
    
    queue= deque()
    visited = set()
    queue.append((a,''))
    visited.add(a)

    while queue:
        nxt,li = queue.popleft()
        if nxt == b: 
            print(li)
            break
        for change, e in [D(nxt),S(nxt),L(nxt),R(nxt)]:
            if change not in visited:
                visited.add(change)
                queue.append((change,li+e))