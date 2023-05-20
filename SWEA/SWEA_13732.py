"""
1.아이디어
    -#인지 확인
    -정사각형인지 확인
        -가로 세로가 같은지 
        -가로 세로 안이 모두 #인지 
"""
def len_chk(sharp):
    row_n=1
    col_n=1
    start_y,start_x=sharp[0]
    for plot in sharp[1:]:
        y,x=plot
        if start_y==y: row_n+=1
        if start_x==x: col_n+=1
    if row_n==col_n and row_n*col_n == len(sharp): 
        for i in range(start_y,start_y+row_n):
            for j in range(start_x,start_x+col_n):
                if board[i][j]!='#': return False
        return True

T = int(input())
for tc in range(1,T+1):
    n=int(input())
    board=[]
    for _ in range(n):
        board.append(list(input()))

    sharp_plot=[]
    for i,b in enumerate(board):
        for j,e in enumerate(b):
            if e=='#': sharp_plot.append((i,j))
    
    if len_chk(sharp_plot): answer="yes"
    else: answer="no"
    print('#{} {}'.format(tc,answer))