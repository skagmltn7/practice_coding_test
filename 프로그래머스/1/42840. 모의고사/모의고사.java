import java.util.*;

class Solution {
    static final int[][] PEOPLE = {
        {1,2,3,4,5},
        {2,1,2,3,2,4,2,5},
        {3,3,1,1,2,2,4,4,5,5}
    };
    public int[] solution(int[] answers) {
        int[] corrects = new int[3];
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        for(int i=0;i<answers.length;i++){
            for(int j =0;j<3;j++){
                if(answers[i]==PEOPLE[j][i%PEOPLE[j].length]){
                    corrects[j]++;
                    if(max<corrects[j]){
                        max = corrects[j];
                        cnt=1;
                    }else if(max==corrects[j]){
                        cnt++;
                    }
                }
            }
        }
        
        int[] ans = new int[cnt];
        int inx = 0;
        for(int i=0;i<3;i++){
            if(max==corrects[i])
                ans[inx++]=i+1;
        }
        return ans;
    }
}