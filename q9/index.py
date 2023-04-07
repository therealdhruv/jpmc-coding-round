arr = list(input().split())
dup = []
ans = ""
for i in arr:
    if i not in dup:
        dup.append(i)
        ans += i + " "
print(ans)