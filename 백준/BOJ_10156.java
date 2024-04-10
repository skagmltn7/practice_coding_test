package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_10156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int won = Integer.valueOf(st.nextToken());
        int snack = Integer.valueOf(st.nextToken());
        int budget = Integer.valueOf(st.nextToken());
        int need = won * snack;
        if (need <= budget) System.out.println(0);
        else System.out.println(need - budget);
    }
}
