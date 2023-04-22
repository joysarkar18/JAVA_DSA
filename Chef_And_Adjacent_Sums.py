def hw(n, a):
    a.sort()
    z = a[n-1] + a[n-2]
    for i in range(n-1):
        if a[i] + a[i+1] >= z:
            return "YES"
    return "NO"


t = int(input())
for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))
    print(hw(n, a))
