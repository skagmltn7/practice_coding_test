"""
1. 아이디어
    - 중복되는 수 없애기
    - 정렬
    - 정렬 인덱스 출력
2. 시간복잡도
1e6 O(nlgn)
"""
import sys
input = sys.stdin.readline

n = int(input())
input_nums = list(map(int,input().split()))
num = set(input_nums)

if n==1: 
    print(0)
    exit(0)

answer_dict=dict()
for i, k in enumerate(sorted(list(num))):
    answer_dict[k]=i

for number in input_nums:
    print(answer_dict[number],end= ' ')