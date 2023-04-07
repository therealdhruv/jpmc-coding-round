n, m = map(int, input().split())
s = input().strip()
a = list(map(int, input().split()))
s1 = set()
for i in s:
    if i not in s1:
        s1.add(i)

s1 = list(s1)
t = 0
for i in s1:
    a1 = []
    for i1 in s:
        if i1 == i:
            a1.append(0)

        else:
            a1.append(a[ord(i1) - 97])

    l = 0
    su = 0
    for i2 in range(n):
        if l == i2:
            su = a1[i2]

        else:
            su += a1[i2]

        if su > m:
            while su > m and l <= i2: su -= a1[l] l += 1 if (i2 - l + 1) > t:
            t = i2 - l + 1

print(t)