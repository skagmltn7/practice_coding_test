"""
1.아이디어
output: 두 집합에 모두 속하는 문자열 원소의 개수
"""

T = int(input())
for tc in range(1,T+1):
    n,m = map(int, input().split())
    s1,s2 = set(),set()
    for e1 in input().split():
        s1.add(e1)
    for e2 in input().split():
        s2.add(e2)
    print('#{} {}'.format(tc,len(s1&s2)))