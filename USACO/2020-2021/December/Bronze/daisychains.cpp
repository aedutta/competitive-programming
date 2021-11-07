#include <iostream>
#include <fstream>
using namespace std;
int main(void){
int n;
cin >> n;
int petals[n];
for (int i = 0; i < n; i++) {
  cin >> petals[i];
}
int ans = 0;
for (int i = 0; i < n; i++) {
  for (int j = i; j < n; j++) {
  int total = 0;
  for (int k = i; k <= j; k++) {
    total += petals[k];
  }
  for (int k = i; k <= j; k++) {
    if (total == petals[k] * (j - i + 1)) {
      ans++;
      break;
    }
  }
  }
  }
cout << ans << endl;
return 0;
}
