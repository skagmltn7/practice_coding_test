"""
output: 뒤에섭무터 처음 0이 아닌 숫자가 나올 때까지 0의 개수
1. 아이디어
  펙토리얼
  str
  뒤에서부터 세면서 0의 개수 세기
"""
import sys
input = sys.stdin.readline

n = int(input())
fact = 1
for i in range(2,n+1):
    fact*=i

fact = str(fact)[::-1]
cnt=0
for n in fact:
    if n == '0': cnt+=1
    else: break
print(cnt)
