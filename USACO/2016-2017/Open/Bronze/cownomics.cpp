#include <iostream> 
#include <fstream> 
#include <cmath> 
using namespace std; 
int N, M; 
string spotty[100], plain[100]; 
bool findPos(int k) 
{ 
  for (int i = 0; i < N; i++) { 
    for (int j = 0; j < N; j++) { 
      if (spotty[i][k] == plain[j][k]) 
        return false; 
      } 
    } 
  return true; 
} 

int main(void) 
{ 
  ifstream fin ("cownomics.in"); 
  ofstream fout ("cownomics.out"); 
  fin >> N >> M; 
  for (int i = 0; i < N; i++) fin >> spotty[i]; 
  for (int i = 0; i < N; i++) fin >> plain[i]; 
  int ans = 0; 
  for (int j = 0; j < M; j++) { 
    if (findPos(j)) ans++; 
  } 
  fout << ans << endl; 
  return 0; 
}
