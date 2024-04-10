"""
1.아이디어
output: 문자열이 균형을 이루고 있는지 확인(y or n)
    -문자열,공백 없애기
    - 괄호인지 확인
    - 괄호 짝맞추기
        (,[는 stack에 넣기
        ),]이면 stack[-1]이 (,[인지 확인 
            -> 틀리면 return 맞으면 pop

        다돌고 빈 stack이 아니면 no 비었으면  yes
"""
import re
import sys
input = sys.stdin.readline

def chkString(s):
    stack=[]
    for ch in s:
        if ch=='(' or ch=='[': 
            stack.append(ch)
        else:
            if not stack: return False
            if ch==')':
                if stack[-1]!='(': return False
                stack.pop()
            else:
                if stack[-1]!='[': return False
                stack.pop()
    else:
        if not stack: return True
    return False

while True:
    inputString = input().rstrip()

    if inputString=='.': break
    
    inputString = re.sub('[a-zA-Z.]','',inputString)
    inputString = re.sub(' ','',inputString)

    if chkString(inputString): print("yes")
    else: print("no")

    
