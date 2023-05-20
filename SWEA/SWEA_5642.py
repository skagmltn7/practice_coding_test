T=int(input())
for tc in range(1,T+1):
    n=int(input())
    num_li = list(map(int,input().split()))
    answer=-10000
    val=0
    for num in num_li:
        val+=num
        if answer<val: answer=val
        if val<0: val=0
    print('#{} {}'.format(tc,answer))