import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Main {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new FileReader("pails.in"));
PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("pails.out")));
StringTokenizer st = new StringTokenizer(br.readLine());
// read X, Y, and M
int x = Integer.parseInt(st.nextToken());
int y = Integer.parseInt(st.nextToken());
int m = Integer.parseInt(st.nextToken());
int n = 0;
int stored = 0;
List<Integer> numbers = new ArrayList<>();
// the purpose of these concatenated loops is to reiterate every possible value of the maximum possible amount of milk pails needed.
// This is stored into an ArrayList which I then simply find the maximum value from. 
for (int i = 0; i <= 1000; i++) {
stored = x * i;
if (x*i > m) break;
   for (int j = stored/x; j >= 0; j--) {
      for (int k = 0; k <=1000; k++) {
      	n = x * j + y * k;
      	if (n <= m) {
      		numbers.add(n);
      	}
      }
   }
}
pw.println(Collections.max(numbers));
pw.close();
		}
  }
