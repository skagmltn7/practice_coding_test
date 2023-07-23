import java.io.*;

public class BOJ_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.valueOf(br.readLine());
        String num2 = br.readLine();

        for (int i = 2; i >= 0; i--) {
            String num = String.valueOf(num2.charAt(i));
            System.out.println(Integer.valueOf(num) * num1);
        }
        System.out.println(num1 * Integer.valueOf(num2));

    }
}