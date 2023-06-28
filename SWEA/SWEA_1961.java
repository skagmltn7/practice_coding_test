package SWEA;
import java.io.*;
import java.util.*;
 
public class SWEA_1961 {
    public static int[][] rotate(int[][] arr, int n) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[j][n - i - 1] = arr[i][j];
            }
        }
        return result;
    }
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n, i, j;
        int[][] arr;
        int T = Integer.parseInt(br.readLine());
 
        for (int tc = 1; tc <= T; tc++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n][n];
            for (i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
 
            int[][] r1 = rotate(arr, n);
            int[][] r2 = rotate(r1, n);
            int[][] r3 = rotate(r2, n);
 
            System.out.printf("#%d\n", tc);
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    System.out.printf("%d", r1[i][j]);
                }
                System.out.printf(" ");
                for (j = 0; j < n; j++) {
                    System.out.printf("%d", r2[i][j]);
                }
                System.out.printf(" ");
                for (j = 0; j < n; j++) {
                    System.out.printf("%d", r3[i][j]);
                }
                System.out.println();
            }
        }
    }
}