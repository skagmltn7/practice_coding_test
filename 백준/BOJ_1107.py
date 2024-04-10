"""
1. 아이디어
    버튼 누르기
    - +
    - - : 채널 0 이면 무시
    - 숫자버튼
    완탐
"""
import sys; input = sys.stdin.readline

target = int(input())

m = int(input())
broken=set()
if m!=0:
    broken = set(input().split())

if target == 100: 
    print(0)
    exit(0)

answer =float('inf')

def canPushButton(channel):
    for c in str(channel):
        if c in broken: return False
    return True

for channel in range(1000001):
    cnt = 0
    if channel==100:
        cnt = abs(target-100)

    elif canPushButton(channel):
        cnt = len(str(channel))
        if channel!=target:
            cnt += abs(channel - target)
    else: continue
    answer = min(answer,cnt)

print(answer)