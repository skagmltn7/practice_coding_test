T=int(input())
for t in range(1,T+1):
    n,k = map(int,input().split())
    
    item=[[0,0]]
    for _ in range(n):
        v,c = map(int,input().split())
        item.append([v,c])

    dp=[[0 for _ in range(k+1)] for _ in range(n+1)]

    for i in range(1,n+1):
        v_i,c_i = item[i]
        for j in range(k+1):
            if v_i > j: 
                dp[i][j]=dp[i-1][j]
            else:
                dp[i][j]=max(dp[i-1][j],dp[i-1][j-v_i]+c_i)

    print('#{} {}'.format(t,dp[-1][-1]))