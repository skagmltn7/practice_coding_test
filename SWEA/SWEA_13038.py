"""
1. 아이디어
    - 일주일 간 수업일수 구하기
    - 지내는 기간 구하기
"""
def cnt_minimum_stay(n,course_per_week,course_open_days,answer):
    week = n//course_open_days # 수업을 듣는 최대 주
    remaining_days=n%course_open_days
    if remaining_days==0: 
        week-=1
        remaining_days = course_open_days
    total= 7*week
    for chk in course_per_week:
        if chk=='1': remaining_days-=1
        total+=1
        if remaining_days==0: break

    if answer>total: answer=total
    return answer

T = int(input()) # 테스트 케이스 수 입력받기
for tc in range(1,T+1):
    n=int(input())
    input_days=input().split()
    answer=float('inf')
    course_open_days = input_days.count('1')#주 수업일 세기
    #학교에 최소로 머물러야하기 때문에 수업이 처음 시작하는 요일에 학교에 머물기 시작해야함.
    for i,chk in enumerate(input_days):
        if chk=='1': #수업 시작일 
            course_days = input_days[i:]+input_days[:i]
            answer = cnt_minimum_stay(n,course_days,course_open_days,answer)
    print('#{} {}'.format(tc,answer))

