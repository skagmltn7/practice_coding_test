"""
output: 의상을 입을 수 있는 경우의 수
1. 아이디어
    - 의상 종류 나누기
    defaultdict
    - 경우의 수 
        dfs
        의상종류 i다음
        for dict[의상]
        
"""
import sys; input = sys.stdin.readline
from collections import defaultdict

T = int(input())
for _ in range(T):
    clothing = defaultdict(int)
    n = int(input())

    for _ in range(n):
        _, kinds = input().split()
        clothing[kinds]+=1
    answer=1
    for cnt in clothing.values():
        answer*=(cnt+1)
    print(answer-1)

