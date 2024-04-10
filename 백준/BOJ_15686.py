"""
1. 아이디어
    - 치킨거리 구하기
        - 집좌표
        - 치킨 좌표
        comination으로 m개의 치킨집 뽑고 집과의 최단거리

    - 도시의 치킨거리 구하기
"""
import sys; input = sys.stdin.readline
from itertools import combinations

def chickenRoad(house, chicken):
    hx, hy = house
    cx, cy = chicken
    return abs(hx-cx) + abs(hy-cy)

houses = []
chickenShops = []

n, m = map(int, input().split())
for i in range(n):
    town = input().split()
    for j in range(n):
        if town[j] == '1': houses.append((i+1,j+1))
        elif town[j] == '2': chickenShops.append((i+1,j+1))

answer = float('inf')
for c in combinations(chickenShops,m):
    combiRoad = 0
    for h in houses:
        streetPerHouse = float('inf')
        for i in range(m):
            streetPerHouse = min(streetPerHouse, chickenRoad(h,c[i]))
        combiRoad += streetPerHouse
    answer = min(answer,combiRoad)

print(answer)