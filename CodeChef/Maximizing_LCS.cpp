// Code by Joy Sarkar
#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    int T;
    cin >> T;
    while (T--)
    {
        int n;
        cin >> n;
        string s1;
        cin >> s1;
        string s2 = s1;
        reverse(s1.begin(), s1.end());

        vector<vector<int>> dp(n + 1, vector<int>(n + 1, 0));
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (s2[i - 1] != s1[j - 1])
                {
                    dp[i][j] = max(dp[i - 1][j], dp[i][j - 1]);
                }
                else
                {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
            }
        }
        cout << dp[n][n] / 2 << endl;
    }

    return 0;
}
