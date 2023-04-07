from typing import DefaultDict

sum = 0
ans = 0


def answer(i, j, num, a2):
    global sum
    global ans
    if i == n - 1 and j == m - 1:
        if mm[num] == 0:
            mm[num] = 1
            ans += 1
            sum += num

        return
    if i == n - 1:
        answer(i, j + 1, num + a2[i][j], a2)
        return
    if j == m - 1:
        answer(i + 1, j, num + a2[i][j], a2)
        return
    answer(i + 1, j, num + a2[i][j], a2)
    answer(i, j + 1, num + a2[i][j], a2)


mm = DefaultDict(int)
n, m = map(int, input().split())
a2 = []
for j in range(n):
    a2.append(list(map(int, input().split())))
answer(0, 0, 0, a2)


print(ans)
print(sum)