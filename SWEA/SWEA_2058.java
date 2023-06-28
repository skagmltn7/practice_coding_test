package SWEA;
import java.io.*;
 
public class SWEA_2058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int answer = 0;
 
        while(input != 0){
            answer += input % 10;
            input /= 10;
        }
        System.out.printf("%d\n",answer);
    }
}