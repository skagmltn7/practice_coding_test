"""
1. 아이디어
    -IOI길이 세기
     IOI체크
2. 시간복잡도
n = 1e6
m = 1e6 O(mlogm)
"""
import sys; input = sys.stdin.readline

n = int(input())
m = int(input())
s = input().strip()

answer = 0
cur, cnt =0,9
while cur < m-1 :
    if s[cur:cur+3] == 'IOI':
        cur+=2
        cnt+=1
        if cnt==n: 
            answer+=1
            cnt-=1
    else:
        cur+=1
        cnt=0
print(answer)