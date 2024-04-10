import java.io.*;

public class BOJ_2441 {
    static String star = "*";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());

        for (int i = 0; i < n; i++) {
            space(i);
            printStar(n - i);
        }
    }

    static void space(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }

    static void printStar(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(star);
        }
        System.out.println();
    }
}