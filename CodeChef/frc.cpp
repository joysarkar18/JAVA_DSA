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
        int arr[n];
        vector<int> ans;
        map<int, pair<int, int>> FreqArr;

        for (int i = 0; i < n; i++)
        {
            cin >> arr[i];
        }

        int nextNum = 1;

        for (int i = 0; i < n; i++)
        {

            if (FreqArr.find(arr[i]) != FreqArr.end())
            {
                if (FreqArr[arr[i]].second > 0)
                {
                    FreqArr[arr[i]].second--;
                    ans.push_back(FreqArr[arr[i]].first);

                    if (FreqArr[arr[i]].second == 0)
                    {
                        FreqArr.erase(arr[i]);
                    }
                }
            }
            else
            {

                FreqArr[arr[i]] = {nextNum, arr[i] - 1};

                if (FreqArr[arr[i]].second == 0)
                {
                    FreqArr.erase(arr[i]);
                }

                ans.push_back(nextNum);

                nextNum++;
            }
        }

        int f = 1;

        for (auto i : FreqArr)
        {

            if (i.second.second > 0)
            {

                f = 0;
                break;
            }
        }

        if (f == 0)
        {
            cout << -1 << endl;
        }

        else
        {
            for (auto i : ans)
            {
                cout << i << " ";
            }
            cout << endl;
        }
    }

    return 0;
}
