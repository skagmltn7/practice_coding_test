"""
1.아이디어
output: max heap구현
    - add
    max heap 마지막에 노드 넣기 
    마지막노드에서 부터 비교해서 max heap 정리
    부모노드보다 작으면 멈춤
    - delete
    루트노드 뺀 후 max heap 마지막 노드 루트로 올리기
    루트에서 부터 비교해서 max heap 정리
    자식 노드보다 크면 멈춤

"""
class max_heap:
    def __init__(self):
        self.queue=[]

    def parent(self,index):
        return (index-1)//2
    
    def left_child(self,index):
        return index*2+1
    
    def right_child(self,index):
        return index*2+2
    
    def swap_node(self,inx,parent):
        self.queue[inx],self.queue[parent]=self.queue[parent],self.queue[inx]

    def add_node(self,node):
        self.queue.append(node)
        last = len(self.queue)-1
        while last>=0:
            parent = self.parent(last)
            if  parent>=0 and self.queue[parent]<self.queue[last]:
                self.swap_node(last,parent)
                last = parent
            else: break

    def delete_node(self):
        last = len(self.queue)-1
        if last<0: 
            return '-1 '
        self.swap_node(last,0)
        max_val = self.queue.pop()
        self.max_heapify(0)
        return '{} '.format(max_val)
    
    def max_heapify(self,inx):
        left,right = self.left_child(inx),self.right_child(inx)
        max_inx = inx
        
        if left<len(self.queue) and self.queue[left]>self.queue[max_inx]:
            max_inx=left
        if right<len(self.queue) and self.queue[right]>self.queue[max_inx]:
            max_inx=right
        
        if max_inx!=inx:
            self.swap_node(inx,max_inx)
            self.max_heapify(max_inx)

T=int(input())
answer=[]
for tc in range(1,T+1):
    tmp='#{} '.format(tc)
    n=int(input())
    heap = max_heap()
    for _ in range(n):
        cal = list(map(int,input().split()))
        if cal[0]==1:
            heap.add_node(cal[1])
        else:
            tmp+=heap.delete_node()
    answer.append(str(tmp))

for a in answer:
    print(a)