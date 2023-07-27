import java.io.*;

public class BOJ_5565 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.valueOf(br.readLine());
        for(int i = 0; i<9;i++){
            total -= Integer.valueOf(br.readLine());
        }
        System.out.println(total);
    }
}