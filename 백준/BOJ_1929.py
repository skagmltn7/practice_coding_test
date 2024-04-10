def is_prime(n):
    if n==1: return False
    for i in range(2,int(n**.5)+1):
        if n%i==0: return False
    return True

m,n=map(int,input().split())
for num in range(m,n+1):
    if is_prime(num): print(num)
