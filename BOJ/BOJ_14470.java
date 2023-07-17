package BOJ;

import java.io.*;

public class BOJ_14470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = new int[5];

        for (int i = 0; i < 5; i++) {
            input[i] = Integer.valueOf(br.readLine());
        }
        int time = 0;
        while (input[0] != input[1]) {
            if (input[0] < 0) {
                time += -input[0] * input[2] + input[3];
                input[0] = 0;
            } else {
                time += (input[1] - input[0]) * input[4];
                input[0] = input[1];
            }
        }
        System.out.println(time);
    }
}
