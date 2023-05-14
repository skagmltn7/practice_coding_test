"""
1.아이디어
output: 문장별 이름의 개수
    -문장 저장하기
    -문장 나누기 (.,!,?)
    -이름 세기 (이름은 첫번째문자만 대문자 알파벳으로 시작,숫자 포함X)
"""
# import re
# T = int(input())
# for i in range(1, T+1):
#     n=int(input())
#     li=re.split('[.?!] *',input())
#     answer=[0]*n
#     pattern=re.compile('[A-Z][a-z]*[a-z]$')
#     for i,sentence in enumerate(li[:-1]):
#         for word in sentence.split():
#             if re.fullmatch(pattern,word): answer[i]+=1
#     print('#{} {}'.format(i,' '.join(map(str,answer))))
def name_chk(word):
    for i,ch in enumerate(word):
        if i==0 and ('A'>ch or 'Z'<ch): return False
        if ch.isdigit(): return False
        if i>0 and 'A'<=ch<='Z': return False
    return True

T = int(input())
for i in range(1,T+1):
    n = int(input())
    num,sentence_chk=0,False
    sentnece_num=0
    word_li=''
    while True:
        li=input()
        if sentnece_num==0: word_li+=li
        else: word_li+= ' '+li
        sentnece_num+=li.count('.')+li.count('!')+li.count('?')
        if sentnece_num==n: break
    print('#{}'.format(i),end=' ')
    for word in word_li.split():
        if word[-1] in '.?!': 
            word = word[:-1]
            sentence_chk=True
        if name_chk(word): num+=1
        if sentence_chk: 
            print(num,end=' ')
            num=0
            sentence_chk=False
    print()

