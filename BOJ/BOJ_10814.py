n = int(input())
li=[]
for inx in range(n):
    age,name=input().split()
    li.append((inx,int(age),name))
li.sort(key= lambda x: (x[1],x[0]))
for person in li:
    print(person[1],person[2])