import sys; input = sys.stdin.readline

def draw(y,x,n):
    if n == 3:
        li[y][x] = '*'
        li[y+1][x-1] = li[y+1][x+1] = '*'
        for i in range(-2,3):
            li[y+2][x+i] = '*'
    else:
        nxt = n//2
        draw(y,x,nxt)
        draw(y+nxt,x-nxt,nxt)
        draw(y+nxt,x+nxt,nxt)

n = int(input())
li = [[' '] * 2 * n for _ in range(n)]

draw(0,n-1,n)
for i in range(n): print(''.join(li[i]))