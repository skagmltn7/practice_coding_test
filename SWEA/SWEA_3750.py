"""
1. 아이디어
output 한자리 수 가 될때까지의 f(n)
    while len(n)!=1
    - f(n)구현
        -각 자리수 계산
        -n 다시 만들기   
"""
def func(num):
    tmp=0
    while num:
        tmp += num%10
        num//=10
    num=tmp
    if num//10==0: return num
    return func(num)

T = int(input())
li=[]
for tc in range(1,T+1):
    li.append(int(input()))

for i, num in enumerate(li):
    answer = func(num)
    print('#{} {}'.format(i+1,answer))