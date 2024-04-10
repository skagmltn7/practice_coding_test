"""
1.아이디어
output: n개 만들 수 있는 랜선의 최대 길이
이진탐색
"""
k, n = map(int,input().split())
answer = 0
wires=[]
for _ in range(k): wires.append(int(input()))
start, end = 0, 2**31 - 1

while start <= end:
    mid = (start + end)//2
    cnt=0

    for wire in wires:
        cnt+=wire//mid
    
    if cnt < n: end = mid-1
    else:
        answer = mid
        start = mid + 1
print(answer)