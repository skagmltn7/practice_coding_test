import java.util.*;

class Solution {
    class Job{
        int start, end, profit;
        public Job(int start, int end, int profit){
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
        public String toString(){
            return "start: "+start+" end: "+end+" profit: "+profit;
        }
    }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int total = startTime.length;
        Job[] jobs = new Job[total];
        for(int i=0;i<total;i++){
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }
        Arrays.sort(jobs,(j1,j2)->Integer.compare(j1.end,j2.end));

        int[] dp = new int[total+1];

        for(int i=0;i<total;i++){
            int inx = findNextJob(jobs,i,jobs[i].start);
            dp[i+1] = Math.max(dp[i],dp[inx]+jobs[i].profit);
        }
        return dp[total];
    } // end of main
    public int findNextJob(Job[] jobs, int endInx, int targetTime){
        int left = 0;
        int right = endInx;

        while(left<right){
            int mid = (left+right)/2;
            if(jobs[mid].end <= targetTime){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }
} // end of class