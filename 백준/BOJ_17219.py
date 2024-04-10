"""
1. 아이디어
    - dict 
"""
import sys; input = sys.stdin.readline

n, m = map(int,input().split())
passwords = dict()

for _ in range(n):
    site, password = input().split()
    passwords[site] = password

for _ in range(m):
    site = input().rstrip()
    print(passwords[site])