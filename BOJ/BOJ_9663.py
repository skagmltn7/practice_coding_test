"""
1. 아이디어
dfs
조건
1. 같은 행x ->dfs에서 처리
2. 같은 열x -> col함수(from i-1,0)
3. 오른쪽 대각선x -> dia(+1)
4. 왼쪽 대각선x -> dai(-1)
"""
import sys; input = sys.stdin.readline
n = int(input())
answer = 0
row = [0]*n

def chk(y):
    for i in range(y):
        if row[y]==row[i] or abs(row[y]-row[i])==abs(y-i):
            return False
    return True

def dfs(y):
    global answer
    if y == n: 
        answer+=1
        return
    for i in range(n):
        row[y] = i
        if chk(y):
            dfs(y+1)

dfs(0)
print(answer)