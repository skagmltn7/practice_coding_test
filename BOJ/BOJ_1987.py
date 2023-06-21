"""
1. 아이디어
    - 이동
    dfs
    - 알파벳 체크
    set not in
"""
import sys; input = sys.stdin.readline

r, c = map(int, input().split())
board = []
for _ in range(r): board.append(input().rstrip())

answer = 0
route = set()
route.add(board[0][0])

dy = (-1,0,1,0)
dx = (0,1,0,-1)

def dfs(plot,cnt):
    global answer
    answer = max(answer, cnt)
    cury, curx = plot
    route.add(board[cury][curx])
    for i in range(4):
        ny, nx = cury + dy[i], curx + dx[i]
        if 0 <= ny < r and 0 <= nx < c:
            if board[ny][nx] not in route:
                dfs((ny,nx),cnt+1)
    route.remove(board[cury][curx])

dfs((0,0),1)
print(answer)