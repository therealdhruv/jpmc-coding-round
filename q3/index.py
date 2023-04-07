t = int(input())
a = []
m = -1
m1 = -1
for i in range(t):
    m1 = int(input())
    a.append(m1)
    m = max(m, m1)
k2 = 2
n = m + 1
k1 = ["0"] * (n)
k1[1] = "1"
a1 = 1
while k2 < (n):
    if k1[a1][-1] == "0":
        k1[k2] = k1[a1] + "0"
        k2 += 1
        if k2 >= (n):
            break
        k1[k2] = k1[a1] + "1"
        k2 += 1
        if k2 >= (n):
            break
        a1 += 1
    elif k1[a1][-1] == "1":
        k1[k2] = k1[a1] + "0"
        k2 += 1
        if k2 >= (n):
            break
        a1 += 1
for i in a:
    print(k1[i])