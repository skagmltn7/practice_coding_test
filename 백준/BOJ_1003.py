"""
1. 아이디어
-max값 하나 정해서 끝ㄲ ㅏ지 돈 후 
    -i-1
        -1
        one[i]+=1
        -0
        zero[i]+=1
        else
        one[i]+=one[i-1]
        zero[i]+=zero[i-1]
    -i-2
        -1
        one[i]+=1
        -0
        zero[i]+=1
        else
        one[i]+=one[i-2]
        zero[i]+=zero[i-2]
"""
import sys
input = sys.stdin.readline

def cnt(cur,inx,one,zero):
    one[cur]+=one[inx]
    zero[cur]+=zero[inx]

T= int(input())
nums=[]
for _ in range(T):
    nums.append(int(input()))

max_val = max(nums)

one, zero = [0]*(max_val+1),[0]*(max_val+1)
if max_val==0:
    one.append(1)
    zero.append(0)
else: 
    one[1]=1
zero[0]=1

for inx in range(2,max_val+1):
    cnt(inx,inx-1,one,zero)
    cnt(inx,inx-2,one,zero)

for n in nums:
    print(zero[n],one[n])
