// Code by Joy Sarkar
#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    int T;
    cin >> T;
    while (T--)
    {
        int n, k;
        cin >> n >> k;

        vector<int> h;
        vector<int> p;
        for (int i = 0; i < n; i++)
        {
            int temp;
            cin >> temp;
            h.push_back(temp);
        }
        for (int i = 0; i < n; i++)
        {
            int temp;
            cin >> temp;
            p.push_back(temp);
        }

        vector<pair<int, int>> pr;
        for (int i = 0; i < n; i++)
        {
            pr.push_back(make_pair(h[i], p[i]));
        }

        sort(pr.begin(), pr.end());

        for (int i = 0; i < n; i++)
        {
            h[i] = pr[i].first;
            p[i] = pr[i].second;
        }

        int mn[n];
        mn[n - 1] = p[n - 1];

        for (int i = n - 2; i >= 0; i--)
        {
            mn[i] = min(mn[i + 1], p[i]);
        }
        int dmg = 0, idx = 0;

        bool pass = 0;
        while (k > 0)
        {
            dmg += k;

            idx = upper_bound(h.begin(), h.end(), dmg) - h.begin();
            if (idx == n)
            {
                pass = 1;
                break;
            }

            k -= mn[idx];
        }
        if (pass)
        {
            cout << "YES" << endl;
        }
        else
        {
            cout << "NO" << endl;
        }
    }

    return 0;
}
