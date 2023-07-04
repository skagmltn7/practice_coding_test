package BOJ;
import java.io.*;

public class BOJ_27324 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n / 10 == n % 10) System.out.println(1);
        else System.out.println(0);
    }
}
