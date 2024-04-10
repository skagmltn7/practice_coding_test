package BOJ;
import java.io.*;

public class BOJ_26545 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int total = 0;
        for (int i = 0; i < n; i++) total += Integer.parseInt(br.readLine());
        System.out.println(total);
    }
}
