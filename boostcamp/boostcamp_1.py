"""
1.아이디어
숫자 중복 횟수 세기
"""
from collections import Counter
arr=list(map(int,input().split()))
element = sorted(list(set(arr)))
arr = Counter(arr)
answer=[]

for num in element:
    cnt =  arr[num] 
    if cnt!=1:
        answer.append(cnt)

if not answer: 
    answer.append(-1)
print(answer)
