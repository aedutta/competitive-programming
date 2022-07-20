#include <iostream>
#include <bits/stdc++.h>
using namespace std;
using ll = long long;

void fill(string str, ll pair[18][18], vector<ll> count){
  for (ll i = 0; i < str.length(); i++) {
    count[str[i] - 'a']++;
    for (ll j = 0; j < 18; j++) {
      pair[str[i] - 'a'][j] += count[j];
    }
  }
}

int main() {
  ll pair_s[18][18], pair_t[18][18], n;
  vector<ll> count_s(18), count_t(18);
  string s, t, q;
  cin >> s; cin >> t;
  fill(s, pair_s, count_s);
  fill(t, pair_t, count_t);
  cin >> n;
  for (ll i = 0; i < n; i++) {
    cin >> q;
    bool isEqual = true;
    for (ll j = 0; j < q.length(); j++) {
      for (ll k = j; k < q.length(); k++) {
        char a = q[j] - 'a'; char b = q[k] - 'a';
        if ((pair_s[a][b] != pair_t[a][b]) || (pair_s[b][a] != pair_t[b][a])) {
          isEqual = false;
        }
      }
    }
    if (isEqual) cout << "Y"; else cout << "N";
  }
}
