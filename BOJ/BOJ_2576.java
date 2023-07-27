import java.io.*;

public class BOJ_2576{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0;i<7;i++){
            int num = Integer.parseInt(br.readLine());
            if(num%2!=0){
                sum += num;
                if(num < min) min = num;
            }
        }
        if(sum==0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}