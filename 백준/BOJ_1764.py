"""
1. 아이디어
교집합
"""
import sys
input = sys.stdin.readline

n, m = map(int,input().split())
a,b = set(),set()
for _ in range(n): a.add(input().rstrip())
for _ in range(m): b.add(input().rstrip())

names = a.intersection(b)

print(len(names))
for name in sorted(list(names)):print(name)