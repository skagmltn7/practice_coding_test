"""
1. 아이디어
output: 거주민 수
    - 조건:
    자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합
"""
T = int(input())
for _ in range(T):
    k = int(input()) # 층
    n = int(input())  #호
    apartment = [[0 for _ in range(n+1)]for _ in range(k)]
    for i in range(1,n+1): apartment[0][i]=i
    
    for j in range(1,k):
        for i in range(1,n+1):
            for z in range(1,i+1):
                apartment[j][i]+=apartment[j-1][z]

    print(sum(apartment[-1]))
