#include <bits/stdc++.h>
using namespace std;
#define int long long
// JOY SARKAR
int helper(int n);

void solve()
{
    int x;
    cin >> x;

    int num = x;
    while (num - helper(num * num) < x)
    {
        int t = num * num;
        int k = helper(t);
        num = x + k;
    }
    cout << num * num << endl;
}

int32_t main()
{
    int T = 1;
    cin >> T;

    while (T--)
        solve();
}

int helper(int n)
{
    int lo = 0, hi = 3e6;
    while (hi - lo > 1)
    {
        int mid = (lo + hi) / 2;
        if ((mid * mid * mid) > n)
            hi = mid;
        else
            lo = mid;
    }
    return lo;
}
