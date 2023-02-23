#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n, k, c = 0;
        cin >> n >> k;
        int arr[n];
        int m = k;
        for (int i = 0; i < n; i++)
        {
            cin >> arr[i];
        }
        for (int i = 0; i < n; i++)
        {
            if (k >= arr[i])
            {
                k -= arr[i];
            }

            else
            {

                c++;
            }
        }
        if (c == 0 || c == n)
        {
            c++;
        }

        cout << c << endl;
    }
    return 0;
}