"""
1.아이디어
    - ai * aj 
    - 단조 증가 확인
"""
def increasing_chk(num):
    number_element=[]
    while num!=0:
        number_element.append(num%10)
        num//=10

    for i in range(1,len(number_element)):
        if number_element[i-1]<number_element[i]:return False
    return True

T = int(input())
for tc in range(1,T+1):
    n=int(input())
    A = list(map(int,input().split()))
    answer=0
    for i in range(n):
        for j in range(i+1,n):
            chk_num=A[i]*A[j]
            if increasing_chk(chk_num) and answer<chk_num:
                answer = chk_num
    if answer==0: answer=-1
    print("#{} {}".format(tc,answer))