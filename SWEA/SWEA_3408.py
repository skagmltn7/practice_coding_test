"""
1.아이디어
    s1: 작은 순서대로 n개의 합
    s2: 홀수인 것 중에 n개의 합
    s3: 짝수인 것 중에 n개의 합
    - 홀수, 짝수 합 누적 리스트 만들기
"""
# T=int(input())

# input_val=[]

# for tc in range(T):
#     input_val.append(int(input()))

# odd,even=[0],[0]

# for i in range(1,max(input_val)*2+1,2):
#     odd.append(odd[-1]+i)
#     even.append(even[-1]+(i+1))

# for tc,sum_val in enumerate(input_val):
#     s1=even[sum_val//2]
#     if sum_val%2:
#         s1+=+odd[sum_val//2+1]
#     else:
#         s1+=+odd[sum_val//2]
#     s2=odd[sum_val]
#     s3=even[sum_val]
#     print('#{} {} {} {}'.format(tc+1,s1,s2,s3))

T=int(input())
for tc in range(1,T+1):
    N=int(input())
    s1=N*(N+1)//2
    s2=N**2
    s3=N*(N+1)
    print('#{} {} {} {}'.format(tc,s1,s2,s3))