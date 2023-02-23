// Code by Joy Sarkar
#include <bits/stdc++.h>
using namespace std;

int main(int argc, char const *argv[])
{
    int T;
    cin >> T;
    while (T--)
    {

        long n, k;
        long s;
        cin >> n >> k;
        cin >> s;

        long sum = 0;

        vector<pair<long, long>> v;
        for (long i = n; i >= 1; i--)
        {

            long power = pow(k, i - 1);
            if (power + sum <= s)
            {
                v.push_back({1, i - 1});
                sum += power;
            }
            else
            {
                v.push_back({-1 * power, i - 1});
            }
        }

        reverse(v.begin(), v.end());

        for (long i = 0; i < v.size(); i++)
        {

            if (v[i].first != 1)
            {

                if (sum + v[i].first > s)
                {

                    v[i].first = -1;
                }
                else if (sum + v[i].first == 0)
                {

                    break;
                }
                else
                {

                    v[i].first = 0;
                }
            }
        }

        if (sum == s)
        {

            for (long i = 0; i < v.size(); i++)
            {
                cout << v[i].first << " ";
            }

            cout << endl;

            continue;
        }
        else if (sum < s)
        {

            cout << -2 << endl;

            continue;
        }

        else
        {
        }

        for (long i = 0; i < v.size(); i++)
        {
            cout << v[i].first << "->" << v[i].second << " ";
        }

        cout << endl;
    }

    return 0;
}
