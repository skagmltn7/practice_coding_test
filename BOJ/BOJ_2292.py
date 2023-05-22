n=int(input())
arr=[0,1,2]
if n==1: print(1)
else:
    answer=3
    while arr[-1]<=n:
        arr.append(arr[-1] + 6*(answer-2))
        answer+=1
    print(answer-2)