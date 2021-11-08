import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Main {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new FileReader("teleport.in"));
PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("teleport.out")));
StringTokenizer st = new StringTokenizer(br.readLine());
int a = Integer.parseInt(st.nextToken());
int b = Integer.parseInt(st.nextToken());
int x = Integer.parseInt(st.nextToken());
int y = Integer.parseInt(st.nextToken());
int path = Math.min(Math.abs(a - x), Math.abs(a - y)) + Math.min(Math.abs(b - x), Math.abs(b - y));
int base_distance = Math.abs(a - b);
pw.println(Math.min(path, base_distance));
pw.close();
		}
  } 
