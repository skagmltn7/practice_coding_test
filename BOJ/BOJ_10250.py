"""
1. 아이디어
output: 정문으로 부터 걷는 거리가 가장 짧은 방 배정
    수직으로 채우기 시작
    n % h == 0? 판단
    - 층수 : 층수는 나머지, 나머지가 0 이면 꼭대기층 
    - 호: 몫+1, 몫
"""
T = int(input())
for _ in range(T):
    h,w,n = map(int,input().split())
    if n%h:
        room = n//h + 1
        floor = n%h
    else:
        room = n//h
        floor = h
    print(str(floor)+format(room,'02'))