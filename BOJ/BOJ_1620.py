"""
1.아이디어
알파벳이면 숫자
숫자면 알파벳 출력
"""
import sys
input = sys.stdin.readline

n,m = map(int,input().split())
name_dict=dict()
num_dict=dict()

for i in range(1,n+1):
    name = input().rstrip()
    name_dict[name] = i
    num_dict[i] = name

for _ in range(m):
    val = input().rstrip()
    if val.isalpha():
        print(name_dict[val])
    else:
        print(num_dict[int(val)])
