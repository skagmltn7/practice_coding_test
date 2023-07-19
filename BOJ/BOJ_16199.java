package BOJ;

import java.io.*;
import java.util.*;

public class BOJ_16199 {
    public static int[] bornDate = new int[3];
    public static int[] date = new int[3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            bornDate[i] = Integer.valueOf(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            date[i] = Integer.valueOf(st.nextToken());
        }

        만나이();
        세는나이();
        연나이();
    }

    public static void 만나이() {
        int age = date[0] - bornDate[0];
        if (date[1] < bornDate[1] || (date[1] == bornDate[1] && date[2] < bornDate[2])) {
            age--;
        }
        System.out.println(age);
    }

    public static void 세는나이() {
        System.out.println(date[0] - bornDate[0] + 1);
    }

    public static void 연나이() {
        System.out.println(date[0] - bornDate[0]);
    }
}
