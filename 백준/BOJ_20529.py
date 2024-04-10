import sys; input = sys.stdin.readline

def get_distance(a,b,c):
    distance = 0
    for i in range(4):
        if a[i]!= b[i]: distance+=1
        if a[i]!= c[i]: distance+=1
        if b[i]!= c[i]: distance+=1
    return distance

T = int(input())
for _ in range(T):
    n = int(input())
    li = input().split()
    if n>32: print(0)
    else:
        answer = float('inf')
        for i in range(n):
            for j in range(i+1,n):
                for z in range(j+1,n):
                    answer = min(answer,get_distance(li[i],li[j],li[z]))
        print(answer)
