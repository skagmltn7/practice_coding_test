package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_13985 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] del = new String[3];
        del[0] = "+";
        del[1] = "=";

        String[] chk = new String[3];
        for (int i = 0; i < 3; i++) chk[i] = "";

        int inx = 0;
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            if (inx < 3 && tmp.equals(del[inx])) {
                inx++;
            } else {
                chk[inx] += tmp;
            }
        }

        int a = Integer.valueOf(chk[0]);
        int b = Integer.valueOf(chk[1]);
        int c = Integer.valueOf(chk[2]);
        System.out.println(a + b == c ? "YES" : "NO");
    }
}

