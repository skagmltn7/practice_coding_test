"""
1.아이디어
output: 자신보다 큰 덩치 사람 수 + 1(덩치 등수)
    - 자신보다 큰 덩치 사람 수 세기
        입력받고 이미 입력받은 애들과 비교하면서 수세기
        dict로 수 세기
"""
n = int(input())
people=[]
for _ in range(n):
    person = tuple(map(int,input().split())) # 몸무게, 키
    people.append(person)

for i in range(n):
    rank=1
    for j in range(n):
        if i==j: continue
        if people[i][0]<people[j][0] and people[i][1]<people[j][1]:
            rank+=1
    print(rank,end=' ')
