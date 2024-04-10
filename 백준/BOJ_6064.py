"""
1. 아이디어
x M씩 증가 , y N씩 증가
x 고정 후 y값 찾기
x,y의 최소공배수를 넘는 경우 -1
"""
import sys; input = sys.stdin.readline

def GCD(a,b):
    if a%b==0: return b
    return GCD(b,a%b)

def calendar(m,n,x,y,lcd):
    for i in range(x,lcd+1,m):
        ny = i%n
        if ny==0: ny = n
        if ny==y: return i
    return -1

T = int(input())
for _ in range(T):
    m,n,x,y = map(int,input().split())

    lcd = (m*n)//GCD(m,n)
    print(calendar(m,n,x,y,lcd))
