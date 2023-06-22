weight = {1:"drv", 2:"dis", 3:"com"}
location = {"drv":1, "dis":1, "com":1}
draw = {"drv":[1,["      [DRV]"]], "dis":[3,["+---------+","| DISPLAY |","+---------+"]],"com":[5,["+---------+","|         |","| COMPUTER|","|         |","+---------+"]]}
n = int(input())
cnt = 1

def paint(paintings):
    for p in zip(*paintings):
        for i in p:
            print(i,end='')
        print()

def drawing():
    print("step "+str(cnt))
    
    desks=[[],[],[]]
    start = [9,9,9]
    for thing in ["com","dis","drv"]: 
        desks[location[thing]-1].append(thing)
        start[location[thing]-1] -= draw[thing][0]
    
    desk = "---------|"
    paintings = []
    for i in range(3):
        tmp = []
        for j in range(start[i]):
            tmp.append(" "*11)
        while desks[i]:
            t = desks[i].pop()
            for d in draw[t][1]:
                tmp.append(d)
        tmp.append(str(i+1)+desk)
        paintings.append(list(tmp))
    paint(paintings)

def cntChk():
    if cnt == n: 
        drawing()
        exit(0)

def move(thing,dest):
    global cnt
    cnt+=1
    location[weight[thing]] = dest
    cntChk()

def hanoi(thing, source, by, dest):
    if thing == 1:
        move(thing,dest)
    else:
        hanoi(thing-1,source,dest,by)
        move(thing,dest)
        hanoi(thing-1,by,source,dest)

if n==1: 
    drawing()
else:
    hanoi(3,1,2,3)
    if n >=8: drawing()