import sys
input = sys.stdin.readline

n,r,c = map(int,input().split())

answer = 0
while n:
    n -= 1

    if r < 2**n and c < 2**n: #1사분면
        d = 0
    elif r < 2**n and c >= 2**n: #2사분면
        d = 1
        c -= 2**n
    elif r >= 2**n and c < 2**n: #3사분면
        d = 2
        r -= 2**n
    else: #4사분면
        d = 3
        r -= 2**n
        c -= 2**n

    answer += (2**n)*(2**n)*d 
print(answer)
