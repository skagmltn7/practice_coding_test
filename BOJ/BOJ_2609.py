def GCD(a,b):
    if a%b==0: return b
    return GCD(b,a%b)
a,b = map(int,input().split())
gcd = GCD(a,b)
print(gcd)
print((a*b)//gcd)