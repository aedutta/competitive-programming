import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Main {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new FileReader("gymnastics.in"));
PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gymnastics.out")));
StringTokenizer st = new StringTokenizer(br.readLine());
int k = Integer.parseInt(st.nextToken());
int n = Integer.parseInt(st.nextToken());
int[][] rank = new int[k][n];
for (int i = 0; i < k; i++) {
  st = new StringTokenizer(br.readLine());
  for (int j = 0; j < n; j++) {
    rank[i][j] = Integer.parseInt(st.nextToken());
  }
}
int count = 0;
for (int i = 0; i < n; i++) {
  for (int j = 0; j < n; j++) {
    int cow1 = rank[0][i];
    int cow2 = rank[0][j];
    int pairs = 0;
    if (cow1 != cow2) {
      for (int l = 0; l < k; l++) {
        int pos1 = 0;
        int pos2 = 0;
        for (int m = 0; m < n; m++) {
          if (rank[l][m] == cow1) pos1 = m;
          if (rank[l][m] == cow2) pos2 = m;
        }
        if (pos1 < pos2) pairs++;
      }
    }
    if (pairs == k) count++;
  }
}
pw.println(count);
pw.close();
		}
  } 
