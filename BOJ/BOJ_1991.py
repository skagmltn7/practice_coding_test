"""
1. 아이디어
    - 이진트리(dict) index 0 :left 1 right
    루트노드는 A
"""
import sys; input = sys.stdin.readline

def travel(node,opt):
    if not node: return 
    if opt=='pre': print(node,end='')
    left, right = tree[node]
    travel(left,opt)
    if opt=='in': print(node,end='')
    travel(right,opt)
    if opt=='post': print(node,end='')
    
n = int(input())
tree = dict()

for _ in range(n):
    me, left, right = input().split()
    if left == '.': left = None
    if right == '.': right = None
    tree[me] = [left,right]

for opt in ['pre','in','post']:
    travel('A',opt)
    print()