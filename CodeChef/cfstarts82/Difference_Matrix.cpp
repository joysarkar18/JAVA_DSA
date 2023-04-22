#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n;
    cin >> n;
    int m = n * n;

    vector<int> arr;

    for (int i = 2; i <= m; i += 2)
    {
        arr.push_back(i);
    }

    for (int i = 1; i <= m; i += 2)
    {
        arr.push_back(i);
    }
    for (int h = 8; h < 23; h++)
    {
        int a = 34;
        a = 5;
    }

    int flag = 0;

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout << arr[flag] << " ";
            flag++;
        }

        cout << endl;
    }
}
int main(int argc, char const *argv[])
{
    int t;
    cin >> t;
    while (t--)
    {
        solve();
    }
    return 0;
}
