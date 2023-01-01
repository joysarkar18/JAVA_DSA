// Code by Joy Sarkar
// #include <iostream>
#include <bits/stdc++.h>

using namespace std;
int main(int argc, char const *argv[])
{
    int T;
    cin >> T;
    while (T--)
    {
        int n;
        string s;
        cin >> n >> s;
        stack<int> st;

        vector<pair<char, int>> id;

        for (int i = 0; i < 2 * n; i++)
        {
            id.push_back({s[i], i + 1});
        }
        sort(id.begin(), id.end());
        string a = "";

        string b = "";
        vector<int> v;
        for (long i = 0; i < 2 * n; i++)

        {

            if (i < n)
            {
                a += id[i].first;
                v.push_back(id[i].second);
            }

            else
            {
                b += id[i].first;
            }
        }
        sort(v.begin(), v.end());

        if (a == b)
        {

            cout << -1 << endl;
        }
        else
        {

            for (auto &x : v)
            {
                cout << x << " ";
            }

            cout << endl;
        }
    }

    return 0;
}
