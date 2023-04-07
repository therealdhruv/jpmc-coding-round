def solve(s, n):
    if n == 0 or n == 1:
        return 1
    ans = 0
    if s[n - 1] > "0":
        ans = solve(s, n - 1)
    if s[n - 2] == "1" or (s[n - 2] == "2" and s[n - 1] < "7"):
        ans += solve(s, n - 2)
    return ans
s = input()
print(solve(s, len(s)))