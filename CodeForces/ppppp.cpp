// Code by Joy Sarkar
#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    int T;
    cin >> T;
    while (T--)
    {
        long long n;
        cin >> n;
        int MOD = 1000000007;

        long long ans = n;
        ans = (ans * (n + 1)) % MOD;
        ans = (ans * ((4 * n - 1) % MOD)) % MOD;
        ans = (ans * 166666668) % MOD;
        cout << (2022 * ans) % MOD << endl;
    }

    return 0;
}
