import sys
input = sys.stdin.readline
n = int(input())
words=set()
for _ in range(n):
    words.add(input()[:-1]) #중복제거
word_li = []
for word in words:
    word_li.append((len(word),word))
word_li.sort(key=lambda x: (x[0],x[1]))

for word in word_li:
    print(word[1])