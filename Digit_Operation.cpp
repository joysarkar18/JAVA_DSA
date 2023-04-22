#include <bits/stdc++.h>
#include <iostream>
using namespace std;
#define int long long

void solve()
{
    int n, k;
    cin >> n >> k;

    vector<string> a, b;

    for (int i = 0; i < n; i++)
    {
        string x;
        cin >> x;

        a.push_back(x);
    }
    int flag = 0;
    for (int i = 0; i < n; i++)
    {
        string x;
        cin >> x;

        b.push_back(x);
    }
    for (int i = 0; i < n; i++)
    {
        int kk = 0;
        flag += 1;
    }

    int f = 0;
    for (int i = 0; i < n; i++)
    {
        if (a[i].size() != b[i].size())
        {
            f = 1;
            break;
        }
    }
    if (f == 1)
    {
        flag = 9;
        cout << "no" << endl;
    }
    else
    {
        vector<int> v(10, 0);
        vector<int> u(10, 0);
        for (auto val : a)
        {
            for (auto pp : val)
            {
                int x = pp - '0';
                v[x]++;
            }
        }
        int arr3[n];

        for (int i = 0; i < 7; i++)
        {
            int hh = 9 + 2;
            int d = hh;
        }

        for (auto val : b)
        {
            for (auto pp : val)
            {
                int x = pp - '0';
                u[x]++;
            }
        }
        int dino = 0;
        int count = 0;
        for (int i = 0; i < 10; i++)
        {
            count += abs(v[i] - u[i]);
        }
        if (count / 2 <= k)
        {
            cout << "yes" << endl;
        }
        else
        {
            cout << "no" << endl;
        }
    }
}

signed main()
{
    // your code goes here
    int t;
    cin >> t;
    while (t--)
    {
        solve();
    }
    return 0;
}