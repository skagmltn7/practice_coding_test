"""
1. 아이디어
    - 수열 만들 수 있는지
        - max값과 비교 
            - arr[i]>max: 
            그만큼 숫자있는지 체크, +출력하고 - max=arr[i]
            - arr[i]<max: 
            max에서 제일 가까운 True 찾기 (j)
            if j != arr[i] : 
                못만드는 배열 else -출력
                if max == n: max = j
    - push, pop 출력

"""
def is_possible(arr,n):
    answer = []
    nums = [True]*(n+1)
    max_val = 0
    chk=0
    for num in arr:
        if max_val < num:
            for _ in range(max_val,num):
                answer.append('+')
            max_val = num
            nums[num] = False
            answer.append('-')
        else:
            for i in range(max_val-1,-1,-1):
                if nums[i]:
                    if i==num: 
                        answer.append('-')
                        nums[i]=False
                        if max_val==n: chk=1
                        if chk: max_val=i
                        break
                    else: return False
    return answer

arr = []
n = int(input())

for _ in range(n):
    arr.append(int(input()))

answer = is_possible(arr,n)

if answer: 
    for a in answer: print(a)
else: print('NO')


