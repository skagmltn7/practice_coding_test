"""
1. 아이디어
output: 마지막 카드
    - 맨 위 카드 버리기
    - 맨 위카드 아래로 보내기
"""
from collections import deque
n = int(input())
cards = deque()
for i in range(1,n+1): cards.append(i)

while len(cards)>1:
    cards.popleft()
    cards.append(cards.popleft())

print(cards[0])

