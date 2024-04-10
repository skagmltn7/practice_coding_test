package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_15963 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        if (a.equals(b)) System.out.println(1);
        else System.out.println(0);
    }
}
