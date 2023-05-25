import sys
input = sys.stdin.readline
n = int(input())
A = set(map(int,input().split()))
m = int(input())
for num in map(int,input().split()):
    if num in A: print(1)
    else: print(0)
