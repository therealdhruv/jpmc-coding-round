s = input()
res = []
x, y = 0, 0
v = "aeiou"
c = "bcdfgh"
p = "2357"
ans = sorted(set(s))
for i in ans:
    if i in p:
        res.append(v[x])
        x += 1
    else:
        res.append(c[y])
        y += 1
for i in s:
    print(res[ans.index(i)], end="")