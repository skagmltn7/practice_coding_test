import java.io.*;

public class BOJ_10886 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int agree = 0;
        for (int i = 0; i < n; i++) {
            if (Integer.valueOf(br.readLine()) == 1) {
                agree++;
            }
        }
        System.out.printf("Junhee is %scute!", n - agree > agree ? "not " : "");
    }
}