package BOJ;

import java.io.*;

public class BOJ_17009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] scores = { 3, 2, 1 };
        int A = 0;
        int B = 0;

        for (int i = 0; i < 3; i++) {
            A += scores[i] * Integer.valueOf(br.readLine());
        }

        for (int i = 0; i < 3; i++) {
            B += scores[i] * Integer.valueOf(br.readLine());
        }

        if (A > B)
            System.out.println("A");
        else if (A == B)
            System.out.println("T");
        else
            System.out.println("B");
    }
}
