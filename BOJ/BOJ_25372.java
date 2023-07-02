package BOJ;
import java.io.*;

public class BOJ_25372 {
    public static String chk(String password) {
        if (password.length() >= 6 && password.length() <= 9) return "yes";
        return "no";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String password;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            password = br.readLine();
            System.out.println(chk(password));
        }

    }
}