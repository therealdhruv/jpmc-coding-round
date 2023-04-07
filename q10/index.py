import math

def isPrime(n):
    if n <= 1:
        return False
    if n <= 3:
        return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    for i in range(5, int(math.sqrt(n)) + 1, 6):
        if n % i == 0 or n % (i + 2) == 0:
            return False
    return True


def solve(n, k):
    c = 0
    list = []
    for i in range(n + 1, 1000000000):
        temp = i
        sum = 0
        while temp != 0:
            sum = sum + temp % 10
            temp = temp // 10
        if isPrime(sum):
            list.append(i)
            c += 1
        if c == k:
            break
    return list[k - 1]


n, k = map(int, input().split())
print(solve(n, k))