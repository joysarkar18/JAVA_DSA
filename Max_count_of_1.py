def max_count_of_ones(n, s):

    x = ['0'] * n  # initialize X with all 0s
    count = s.count('1')  # count of 1s in S

    for i in range(1, n):
        # update X using the given condition
        x[i] = str(int(x[i - 1]) ^ int(s[i - 1]))
        if x[i] == '1':
            count += 1  # increment count if the updated bit in X is 1

    return count


t = int(input())  # number of test cases
for _ in range(t):
    n = int(input())  # length of the string S
    s = input().strip()  # the binary string S
    print(max_count_of_ones(n, s))
