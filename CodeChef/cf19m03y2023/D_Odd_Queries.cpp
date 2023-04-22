

#include <bits/stdc++.h>
using namespace std;

#define MOD 1000000007
#define ll long long

int main(int argc, char const *argv[])
{

    ll t;
    cin >> t;
    while (t--)
    {
        ll n, q;
        cin >> n >> q;
        vector<ll> arr(n), pre(n, 0);
        ll sm = 0;
        for (ll i = 0; i < n; i++)
        {
            cin >> arr[i];
            sm += arr[i];
        }
        pre[0] = arr[0];
        for (ll i = 1; i < n; i++)
            pre[i] = arr[i] + pre[i - 1];
        while (q--)
        {
            ll l, r, k;
            cin >> l >> r >> k;
            ll kss = pre[r - 1] - (pre[l - 1] - arr[l - 1]);
            ll nsm = sm - kss + (r - l + 1) * k;
            if (nsm % 2 == 0)
                cout << "NO" << endl;
            else
                cout << "YES" << endl;
        }
    }
    return 0;
}
