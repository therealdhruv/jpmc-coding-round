from itertools import permutations
def solve(x, n):
    ans = 0
    for i in permutations(x):
        c = 0
        for j in range(n):
            if x[j] != i[j]:
                c += 1
        ans = max(ans, c)
    return ans
t = int(input())
for i in range(t):
    s = input()
    print(solve(s, len(s)))