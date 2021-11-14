#include <iostream> 
#include <fstream> 
#include <cmath> 
using namespace std; 
int n; 
int x[100], y[100];
  
int main(void) 
{ 
ifstream fin ("triangles.in"); 
ofstream fout ("triangles.out"); 
int ans = 0; 
fin >> n;
for (int i = 0; i < n; i++) {
  fin >> x[i] >> y[i];
}
for (int i = 0; i < n; i ++ ) {
  for (int j = 0; j < n; j++) {
    if (i == j || x[i] != x[j]) continue;
      for (int k = 0; k < n; k++) {
        if (i == k || y[i] == y[k]) continue;
          ans = max(ans, abs((y[j] - y[i]) * (x[k] - x[i])));
      }
  }
}
fout << ans; 
return 0; 
}
