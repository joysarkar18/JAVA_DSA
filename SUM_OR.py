MOD = 1000000007


def count_triples(n):
    # Calculate the bitwise OR table for numbers up to n-1
    or_table = [[0] * n for _ in range(n)]
    for i in range(n-1):
        for j in range(i+1, n):
            or_table[i][j] = or_table[j][i] = i | j

# Count the number of triples that satisfy the conditions
    count = 0
    for x in range(1, n):
        for y in range(x, n):
            if x + y >= n:
                break
            z = n - x - y
            if z <= y:
                break
            if or_table[x][y] == z and x % or_table[y][z] == 0:
                count += 1

    return count % MOD


t = int(input())
for i in range(t):
    n = int(input())
    print(count_triples(n))
