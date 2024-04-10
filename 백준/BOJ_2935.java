import java.io.*;
import java.util.*;

public class BOJ_2935{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n1 = br.readLine();
        String op = br.readLine();
        String n2 = br.readLine();

        if(op.equals("*")){
            int len = (n1.length( ) -1)+(n2.length()-1);
            System.out.print("1");
            printZero(len);
            
        } else  {   
            if(n1.length()!=n2.length()){
                int maxLen = Math.max(n1.length(),n2.length());
                int minLen = Math.min(n1.length(), n2.length());
                for(int i=0;i<maxLen;i++){
                    if(i==0||i==maxLen-minLen)System.out.print("1");
                    else System.out.print("0");
                }
                

            }else{
                System.out.print("2");
                printZero(n1.length()-1);
            }
        }
    }

    static void printZero(int cnt){
        for(int i=0;i<cnt;i++){
            System.out.print("0");  
        }
    }
}