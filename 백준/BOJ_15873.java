package BOJ;
import java.io.*;

public class BOJ_15873 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.valueOf(br.readLine());
        int res;
        if (input == 1010) res = 20;
        else if (input / 10 > 10) res = input / 100 + input % 100;
        else res = input / 10 + input % 10;
        System.out.println(res);
    }
}
