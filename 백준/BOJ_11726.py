import sys
input = sys.stdin.readline

n = int(input())
li = [0,1,2]
for i in range(3,n+1):
    li.append((li[-2]+li[-1])%10007)
print(li[n]%10007)