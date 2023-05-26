from collections import Counter

n = int(input())
hasCards = Counter(map(int,input().split()))
m = int(input())
targetCard = list(map(int,input().split()))

for target in targetCard:
    print(hasCards[target],end=' ')