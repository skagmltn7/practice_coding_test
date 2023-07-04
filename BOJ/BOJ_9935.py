"""
output: 폭발 후 남은 문자열
1. 아이디어
    - 문자열비교
        폭발 문자열은 중복되는 문자가 없다. 
        문자열에 폭발 문자열의 마지막 문자가 나오면 
    - 출력
        if empty : FRULA

2. 시간복잡도
n = 1e6 O(nlogn)
m = 1e1
"""
import sys; input = sys.stdin.readline

def bomb(string, target):
    tmp = []
    lastAlphabet = target[-1]
    targetLength = len(target)

    for s in string:
        tmp.append(s)
        if s == lastAlphabet and ''.join(tmp[-targetLength:]) == target:
            for _ in range(targetLength): tmp.pop()

    if tmp: return ''.join(tmp)
    return "FRULA"

s = input().rstrip()
bombStr = input().rstrip()
print(bomb(s, bombStr))