"""
1. 아이디어
output: VPS판단하기
    - () 짝 맞추기
        (면 스택에 넣기
        )만나면 마지막 (빼기 
        stack이 비어있는 데 )들어오면 VPS아님
        문자열이 끝났는데 stack에 (있으면 VPS아님

"""
T = int(input())
for _ in range(T):
    PS = input()
    left_stack=[]
    answer='NO'
    for ch in PS:
        if ch=='(':left_stack.append(ch)
        else:
            if not left_stack: break
            left_stack.pop()
    else: 
        if not left_stack: answer='YES'

    print(answer) 

