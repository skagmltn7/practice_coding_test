arr = [1, 1]
def fact(n):
    for i in range(2, n+1):
        arr.append((arr[-1] * i) % 1234567891)

T = int(input())
li = []
max_val = 0

for i in range(1, T+1):
    n, r = map(int, input().split())
    max_val = max(n, r, max_val)
    li.append((n, r))

fact(max_val)

for i, val in enumerate(li):
    a, b = val
    answer = (arr[a] * pow((arr[a-b] * arr[b]) % 1234567891, 1234567889, 1234567891)) % 1234567891
    print('#{} {}'.format(i+1, answer))