"""
1. 아이디어
output 한자리 수 가 될때까지의 f(n)
    while len(n)!=1
    - f(n)구현
        -각 자리수 계산
        -n 다시 만들기   
"""
T = int(input())
li=[]
for tc in range(1,T+1):
    li.append(input())

for i, num in enumerate(li):
    while len(num)!=1:
        num = sum(map(int,num))
        num = str(num)
    print('#{} {}'.format(i+1,num))