import sys
input = sys.stdin.readline
n=int(input())
li=[]
for _ in range(n):
    x,y = map(int,input().split())
    li.append((x,y))
li.sort(key = lambda x: (x[0],x[1]))

for e in li:
    x,y = e
    print(x,y)