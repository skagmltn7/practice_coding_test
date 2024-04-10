"""
- 아이디어
    - 알파벳이면 피연산자에 넣기
    - 아니면 연산자에 넣기
    - *, /면 연산자[-1]==* or /까지 pop해서 answer += append
    - +, -면 [-1]!= ( pop answer += append
    - )면 연산자[-1]!=(까지 pop해서 answer += pop
"""
import sys; input = sys.stdin.readline

s = input().rstrip()
answer = ""
stack = []

for c in s:
    if c.isalpha(): answer += c
    else:
        if c=='(': stack.append(c)
        elif c=='*' or c=='/':
            while stack and (stack[-1] == '*' or stack[-1] == '/'):
                answer += stack.pop()
            stack.append(c)
        else:
            while stack and stack[-1] != '(':
                answer += stack.pop()
            if c == ')': stack.pop()
            else: stack.append(c)

while stack: answer += stack.pop()
print(answer)