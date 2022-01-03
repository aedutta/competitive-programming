// note this times out because algorithm is O(N^3) 
#include <iostream> 
#include <fstream> 
#include <cmath> 
#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main()
{
    int N;
    string d1ck;
    int count = 0;
    cin >> N >> d1ck;
    for (int i = 0; i < N; i++) {
        for (int j = 1; j <= N - i; j++) {
            string s(d1ck, i, j);
            if (s.length() >= 3) {
                int count1 = 0;
                int count2 = 0;
                for (int k = 0; k < s.length(); ++k) {
                    if (s[k] == 'H') count1++;
                    if (s[k] == 'G') count2++;
                }
                if (count1 == 1 || count2 == 1) {
                    count++;
                }
            }
            else continue;
        }
    }
    cout << count;
}
