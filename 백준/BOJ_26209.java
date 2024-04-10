package BOJ;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n;
        boolean chk = true;
        for (int i = 0; i < 8; i++) {
            n = Integer.parseInt(st.nextToken());
            if (n == 9) chk = false;
        }
        if (chk) System.out.println("S");
        else System.out.println("F");
    }
}
