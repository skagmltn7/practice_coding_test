from collections import defaultdict
from heapq import heappush,heappop

def Find_val(string,heap,sign):
    answer=list(string)
    for i,num in enumerate(string):
        if heap:
            val = str(heappop(heap)*sign)
            if num!=val:
                inx = index_dic[val][-1]
                answer[inx]=answer[i]
                answer[i]=val
                break
        if i==0 and index_dic['0']:
            for _ in index_dic['0']:
                heappush(heap,0)
    return ''.join(answer)

T=int(input())
for tc in range(1,T+1):
    string = input()
    min_heap, max_heap=[],[]
    index_dic=defaultdict(list)

    for inx,num in enumerate(string):
        if num !='0':
            heappush(min_heap,int(num))
            heappush(max_heap,int(num)*(-1))
        index_dic[num].append(inx)

    min_answer=Find_val(string,min_heap,1)
    max_answer=Find_val(string,max_heap,-1)
    
    print('#{} {} {}'.format(tc,min_answer,max_answer))

