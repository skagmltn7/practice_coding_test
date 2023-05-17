answers=[]
for _ in range(int(input())):
    a,b,c,d = map(int,input().split())
    light = min(b,d)-max(a,c)
    if light>0: answers.append(light)
    else: answers.append(0)

for i,answer in enumerate(answers):
    print('#{} {}'.format(i+1,answer))

    