"""
1. 아이디어
- 전위 순회
left 서브트리
    -  before보다 작을경우
        before를 부모등록 
        left등록
    - 클 경우
        before보다 크고 before의 부모보다 작으면 before의 right등록
        before의 부모보다 크면 before = before.parent
2. 시간복잡도
n = 1e4
"""
import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline


def post(start, end):
    if start > end:
        return
    mid = end + 1
    for i in range(start + 1, end + 1):
        if nums[i] > nums[start]:
            mid = i
            break
    post(start + 1, mid - 1)
    post(mid, end)
    print(nums[start])


nums = []
while True:
    try:
        nums.append(int(input()))
    except:
        break

post(0, len(nums) - 1)
