#include <bits/stdc++.h>
using namespace std;

int main(void)
{
    int t;
    cin >> t;
    while (t--)
    {
        long long a, b, c, d;
        cin >> a >> b >> c >> d;
        if ((a + 1) % b == (c + 1) % d)
        {
            cout << 1 << endl;
            continue;
        }
        long long temp = lcm(b, d);
        cout << temp - (a % b) << endl;
    }
    return 0;
}