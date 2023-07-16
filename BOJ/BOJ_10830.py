import sys

input = sys.stdin.readline

n, b = map(int, input().split())
a = [list(map(int, input().split())) for _ in range(n)]


def multipleMatrix(arr1, arr2):
    res = [[0 for _ in range(n)] for _ in range(n)]
    for i in range(n):
        for j in range(n):
            for k in range(n):
                res[i][j] += (arr1[i][k] % 1000) * (arr2[k][j] % 1000)
            res[i][j] %= 1000
    return res


def divide(arr, cnt):
    if cnt == 1:
        return arr
    tmp = divide(arr, cnt // 2)
    if cnt % 2 == 0:
        return multipleMatrix(tmp, tmp)
    else:
        return multipleMatrix(multipleMatrix(tmp, tmp), arr)


answer = divide(a, b)

for i in range(n):
    for j in range(n):
        print(answer[i][j] % 1000, end=" ")
    print()
