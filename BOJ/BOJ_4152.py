while True:
    lens = list(map(int,input().split()))
    if sum(lens)==0: break
    total,max_len = 0,0
    for i in lens:
        if max_len<i: max_len=i
        total+=i**2
    if total - 2*(max_len**2) == 0: print('right')
    else: print('wrong')