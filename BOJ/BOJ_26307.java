package BOJ;
import java.io.*;
import java.util.StringTokenizer;

public class BOJ_26307 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = 9 * 60;
        int h = Integer.parseInt(st.nextToken()) * 60;
        int m = Integer.parseInt(st.nextToken());
        System.out.println(h + m - start);
    }
}
