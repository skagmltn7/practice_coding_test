import sys
input = sys.stdin.readline

N, M, B = map(int, input().split())
land = []
for _ in range(N):
    land += list(map(int, input().split()))

time = float('inf')
height = 0

for h in range(257):
    build_time = 0
    remove_blocks = 0
    add_blocks = 0

    for l in land:
        if l < h:
            remove_blocks += h - l
        else:
            add_blocks += l - h

    if remove_blocks > add_blocks + B:
        continue

    build_time = remove_blocks + add_blocks * 2
    if build_time <= time:
        time = build_time
        height = h

print(time, height)