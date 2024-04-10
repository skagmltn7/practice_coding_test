import sys;input = sys.stdin.readline

def tellTruth(people):
    for person in people:
        knowTruth.add(person)

def CanLie(party):
    for person in party:
        if person in knowTruth:
            return False
    return True

def partyChk():
    inxs = []
    for inx, party in enumerate(parties):
        if not CanLie(party):
            tellTruth(party)
            inxs.append(inx)
    return inxs

n, m = map(int, input().split())
knowTruth = set()
knowTruthPeople = list(map(int, input().split()))

if len(knowTruthPeople) == 1:
    print(m)
    exit(0)

tellTruth(knowTruthPeople[1:])

parties = []
for party in range(m):
    tmp = list(map(int,input().split()))[1:]
    if not CanLie(tmp):
        tellTruth(tmp)
    else:
        parties.append(list(tmp))

while True:
    remove = partyChk()
    if len(remove)==0:
        print(len(parties))
        exit(0)
    for inx in remove[::-1]:
        del parties[inx]
