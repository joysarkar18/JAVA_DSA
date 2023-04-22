s1 = input().strip()
s2 = input().strip()

min_diff = 0
max_diff = 0

for i in range(len(s1)):
    if s1[i] != s2[i]:
        if s1[i] == '?' or s2[i] == '?':
            max_diff += 1
        else:
            min_diff += 1
            max_diff += 1

print(min_diff, max_diff)
