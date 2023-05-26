"""
1. 아이디어
output: 적어도 m미터일 떄 h의 최댓값
    - 나무 절단
        - h이하 나무는 잘리지 않음 -> h는 min(tree)보단 커야함
        - h초과 나무는 그 위만 잘리고 h로 값 바꿔야함
    - h 범위 정하기
        start = min(trees), end = sum(tress)
        i from 1 to end-mid+1: cnt+= i
        cnt>m:end=mid-1
        cnt==m: h=mid
        cnt<m: start=mid+1

2. 시간복잡도
1e6 O(nlogn)
"""

n,m = map(int,input().split())
trees = list(map(int,input().split()))
start, end = 0, max(trees)
answer = 0
while start <= end:
    mid = (start + end)//2
    cnt = 0
    for tree in trees:
        if tree > mid: cnt += tree - mid
    
    if cnt < m: end = mid - 1
    else: 
        answer = mid
        start = mid + 1
print(answer)
