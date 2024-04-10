def element_sum(n):
    val=0
    while n:
        val += n%10
        n//=10
    return val

n=int(input())
for i in range(1,n):
    if i+element_sum(i) == n: 
        print(i)
        break
else: print(0)
