"""
1. 아이디어
output: 요세푸스 순열 출력
    - k번째 숫자 빼기
        queue앞 빼면서 cnt-- append
        cnt==0 : cnt=k, answer.append(pop)
        
    
"""
from collections import deque
answer=[]

n,k = map(int,input().split())
queue = deque([i for i in range(1,n+1)])

cnt = k
while queue:
    cnt-=1
    queue.append(queue.popleft())
    if cnt==0: 
        cnt = k
        answer.append(queue.pop())
print('<',end='')
for th in answer[:-1]: print(th,end=', ')
print(answer[-1],end='>')


