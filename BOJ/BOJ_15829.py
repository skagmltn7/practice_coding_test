"""
1. 아이디어
output: 해쉬값
    -알파벳 정수로 치환
    ord(ch) - ord('a')+1
    - (알파벳정수 * 31**i) // 1234567891
"""
import sys
input = sys.stdin.readline

l = int(input())
s = input().rstrip()
val = 0

for i in range(l):
    alphaNum = ord(s[i])-ord('a')+1
    val += (alphaNum * 31**i)%1234567891

print(val%1234567891)