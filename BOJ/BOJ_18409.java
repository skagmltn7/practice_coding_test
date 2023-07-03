package BOJ;
import java.io.*;

public class BOJ_18409 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int answer = 0;
        for (int i = 0; i < N; i++) {
            switch (str.charAt(i)) {
                case 'a':
                case 'i':
                case 'u':
                case 'e':
                case 'o':
                    answer += 1;
            }
        }
        System.out.println(answer);
    }
}
