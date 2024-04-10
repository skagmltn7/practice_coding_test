from heapq import heappush, heappop

def solution(sequence, k):
    start, end, total = 0, 0, sequence[0]
    n = len(sequence)
    answer = []
    
    while True:
        if total == k:
            heappush(answer,(end - start, [start,end]))
        
        if start >= n and end >= n: break
        
        if total <= k and end < n:
            end += 1
            if end < n: total += sequence[end]
        else:
            total -= sequence[start]
            start += 1            
    
    return heappop(answer)[1] 