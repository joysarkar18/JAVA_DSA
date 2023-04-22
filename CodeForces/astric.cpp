#include <bits/stdc++.h>
#include <string>
using namespace std;
void solve()
{
    string a;
    string b;
    cin >> a >> b;
    int a1 = a.length();
    int b1 = b.length();
    map<string, int> hash;
    for (int i = 0; i < a1 - 1; i++)
    {
        hash[a.substr(i, 2)]++;
    }
    for (int i = 0; i < b1 - 1; i++)
    {
        if (hash[b.substr(i, 2)] > 0)
        {
            cout << "YES\n";
            cout << "*" << b.substr(i, 2) << "*\n";
            return;
        }
    }
    if (b[b1 - 1] == a[a1 - 1])
    {
        cout << "YES\n";
        cout << "*" << b[b1 - 1] << "\n";
        return;
    }
    if (b[0] == a[0])
    {
        cout << "YES\n";
        cout << b[0] << "*"
             << "\n";
        return;
    }
    cout << "NO\n";
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