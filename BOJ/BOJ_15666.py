"""
1. 아이디어
    - 오름차순 정렬
    - i시작 조건 [-1]<=li[i]
    - set에 없으면 넣고 출력
"""
import sys; input = sys.stdin.readline
n, m = map(int,input().split())
nums = list(map(int,input().split()))
nums.sort()
chk=set()

def makeArr(li):
    if len(li) == m:
        if tuple(li) not in chk:
            chk.add(tuple(li))
            print(' '.join(map(str,li)))
        return
    for i in range(n):
        if not li or li[-1] <= nums[i]:
            li.append(nums[i])
            makeArr(li)
            li.pop()

makeArr([])