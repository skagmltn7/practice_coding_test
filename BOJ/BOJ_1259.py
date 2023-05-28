import sys
input = sys.stdin.readline

def chkPalindrome(num,left,right):
    if left > right: return True
    if num[left]!=num[right]: return False
    return chkPalindrome(num,left+1,right-1)

while True:
    n = input().rstrip()

    if n=="0": break
    if chkPalindrome(n,0,len(n)-1): print("yes")
    else: print("no")

    