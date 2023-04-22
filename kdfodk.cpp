#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

int main()
{
    string s1, s2;
    cin >> s1 >> s2;

    int min_diff = 0, max_diff = 0;
    int n = s1.length();

    for (int i = 0; i < n; i++)
    {
        if (s1[i] == s2[i])
            continue;
        if (s1[i] == '?' || s2[i] == '?')
            max_diff++;
        else
        {
            min_diff++;
            max_diff++;
        }
    }

    cout << min_diff << " " << max_diff << endl;
    return 0;
}
