"""
output: 하얀색 , 파란색 색종이의 개수
1. 아이디어
    - 색종이 검사
        n*n 개인지(완탐)
    - 색종이 자르기
    1 (row_start,n//2,col_start,n//2)
    2 (n//2,n,col_start,n//2)
    3 (row_start,n//2,n//2,n)
    4 (n//2,n,n//2,n)
"""
import sys
sys.setrecursionlimit(10**6)
innput = sys.stdin.readline

def chk(paper,x,y,n):
    chk=paper[y][x]
    for i in range(y,y+n):
        for j in range(x,x+n):
            if paper[i][j]!=chk: return False
    answer[chk]+=1
    return True

def divide(paper,x,y,n):
    if not chk(paper,x,y,n):
        divide(paper,x,y,n//2)
        divide(paper,x+n//2,y+n//2,n//2)
        divide(paper,x+n//2,y,n//2)
        divide(paper,x,y+n//2,n//2)
        return    
n = int(input())
paper = []

for _ in range(n):
    paper.append(list(map(int,input().split())))

answer=[0,0] # 하얀색 0 , 파란색 1
divide(paper,0,0,n)
for a in answer: print(a)