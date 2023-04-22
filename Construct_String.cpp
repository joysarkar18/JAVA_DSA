#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    int t;
    cin >> t;

    while (t--)
    {
        int n;
        cin >> n;

        string str;
        cin >> str;
        string ans = "";
        for (int i = 0; i < n; i++)
        {
            int cnt = 1;
            while (i + 1 < n && str[i] == str[i + 1])
            {
                cnt++;
                i++;
            }

            if (cnt % 2 == 0)
            {
                ans += str[i];
                ans += str[i];
            }
            else
            {
                ans += str[i];
            }
        }

        cout << ans << endl;
    }
    return 0;
}
