"""
1.아이디어
    -팰린드롬 처리
        이중포인터
    -*처리
        문자 비교 
        *아닌애 한칸 앞
        둘다 *이면 아무거나 앞으로
        비교
"""
def palindrome_with_wildcard(string):
    left,right=0,len(string)-1
    while left<right:
        if string[left]!=string[right]:
            if string[left]=='*':
                if not palindrome_with_wildcard(string[left+1:right+1]):
                    right-=1
                else:
                    return True
            elif string[right]=='*': 
                if not palindrome_with_wildcard(string[left:right]):
                    left+=1
                else: 
                    return True
            else:
                if string[left]=='*':
                    left+=1
                elif string[right]=='*':
                    right-=1
                else:
                    return False
        else:
            if string[left]!='*' and string[left]!='*': 
                left+=1
                right-=1
            else:
                left+=1
    else: return True

T=int(input())
for tc in range(1,T+1):
    in_string=list(input())
    answer='Exist'
    if not palindrome_with_wildcard(in_string):
        answer='Not exist'
    print('#{} {}'.format(tc,answer))