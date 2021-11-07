import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Main {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new FileReader("diamond.in"));
PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("diamond.out")));
StringTokenizer st = new StringTokenizer(br.readLine());

int n = Integer.parseInt(st.nextToken());
int k = Integer.parseInt(st.nextToken());
int[] a = new int[n];
for(int i = 0; i < n; i++) {
	a[i] = Integer.parseInt(br.readLine());
}
Arrays.sort(a);
int ans = 0;
for (int i = 0; i < n; i++) {
  int count = 1;
  for (int j = i+1; j < n; j++) {
    if (Math.abs(a[i] - a[j]) <= k) {
    ++count;
    }
    else break;
  }
  ans = Math.max(count, ans);
}
pw.println(ans);
pw.close();
		}
  }
