memory = {"BOOL":1, "SHORT":2, "FLOAT":4, "INT":8,"LONG":16}

def grouping(param0):
    total_bytes,bytes=0,0
    group,tmp=[],[]

    for t in param0:
        add_bytes=memory[t]
        if memory[t]>=8: # int, long
            if tmp:
                group.append([list(tmp),bytes])
                add_bytes += 8-bytes
                bytes=0
                tmp=[]
            group.append([t])

        else:
            if memory[t]>=2: # short,float
                if tmp and tmp[-1]=="BOOL": # 앞에 bool 처리
                    if bytes + 2*memory[t]-1 <= 8:
                        padding_num = memory[t]-1
                        tmp.append('.'*padding_num)
                        add_bytes+=padding_num # 패딩 수

            if bytes+add_bytes>8:
                group.append([list(tmp),bytes])
                total_bytes+= 8 - bytes
                tmp=[t]
                bytes=add_bytes
            else:
                tmp.append(t)
                bytes+=add_bytes

        total_bytes+=add_bytes

    if tmp: 
        group.append([list(tmp),bytes])
        total_bytes += 8-bytes
    if total_bytes > 128: return False
    return group

def drawing(groups):
    answer=[]
    for group in groups:
        if len(group)==2:
            tmp=''
            padding_num = 8 - group[1]
            if padding_num:
                t_set = set(group[0])
                if padding_num%4==0 and "FLOAT" in t_set: 
                    inx = group[0].index("FLOAT")
                elif padding_num%2==0 and "SHORT" in t_set:
                    inx = group[0].index("SHORT")
                else:
                    inx = group[0].index("BOOL")
                group[0].insert(inx+1,'.'*padding_num)
            for t in group[0]:
                if '.' in t:
                    tmp+=t
                    continue
                tmp += '#'*memory[t]
            answer.append(tmp)
        else:
            answer.append("#"*8)
            if group[0]=='LONG': answer.append("#"*8)
    return answer

group = grouping(param3)
if group:
    print(','.join(drawing(group)))
else:
    print('HALT')







