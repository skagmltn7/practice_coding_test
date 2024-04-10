import sys
input = sys.stdin.readline
n = int(input())
cnt=1
i=666
while cnt<n:
    i+=1
    if '666' in str(i): cnt+=1
print(i)