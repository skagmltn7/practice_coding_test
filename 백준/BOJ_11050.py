from math import comb
n, k = map(int,input().split())
answer = comb(n,k)
print(answer)
