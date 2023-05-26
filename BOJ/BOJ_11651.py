"""
1. 아이디어
output: 정렬 결과 출력
    - 문자열 입력받기
    - 정렬하기
        - y 오름차순
        - x 오름차순
"""
n = int(input())
points=[]
for _ in range(n):
    points.append(tuple(map(int,input().split())))
for point in sorted(points,key=lambda x: (x[1],x[0])):
    print(point[0],point[1])
