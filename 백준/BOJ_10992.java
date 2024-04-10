import java.io.*;

public class BOJ_10992{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        for(int i=0;i<n;i++){
            if  (i==n-1) {
                for(int j=0;j<2*n-1;j++){
                    System.out.print("*");
                }
            }
            else{
                for (int j = 1; j < n-i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                if(i!=0){
                for(int j=2*i-1;j>0;j--){
                    System.out.print(" ");
                }
                System.out.print("*");
                }
            }
            System.out.println();
        }   
    }
}