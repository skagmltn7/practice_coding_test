"""
1. 아이디어
    - 중복없이 m개 수열
"""
import sys; input = sys.stdin.readline
from itertools import combinations

n, m = map(int,input().split())
for c in list(combinations(range(1,n+1),m)):
    for num in c: print(num,end=' ')
    print()