from collections import deque
dy = (1,0,-1,0)
dx = (0,1,0,-1)
def move(x,y):
    queue = deque()
    queue.append([x,y,0])
    visited = [[False for _ in range(w+1)]for _ in range(h+1)]

    while queue:
        next_x,next_y,next_cnt= queue.popleft()
        if next_x==0 or next_x==w or next_y==0 or next_y==h:
            print(next_cnt)
            break
        for i in range(4):
            nx,ny = next_x+dx[i], next_y+dy[i]
            if 0<=nx<=w and 0<=ny<=h and not visited[ny][nx]:
                visited[ny][nx]=True
                queue.append([nx,ny,next_cnt+1])

x,y,w,h = map(int,input().split())
move(x,y)
