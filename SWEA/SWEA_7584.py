"""
1. 아이디어

"""
T = int(input()) # 테스트 케이스 수 입력받기
for tc in range(1,T+1): 
    # tc번째 테스트 케이스의 K 입력받기 
    # K번째는 인덱스 K-1
    k = int(input())-1 
    n=0
    while k>=0:
        if k % 2: k=(k-1)//2
        if k % 4 == 0: 
            break
        elif k%2==0:
            n=1
            break
    print('#{} {}'.format(tc,n))

