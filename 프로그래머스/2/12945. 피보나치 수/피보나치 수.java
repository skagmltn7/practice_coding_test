class Solution {
    public int solution(int n) {
        return fibo(1,0,1,n);
    }
    public int fibo(int inx, int n_1, int n_2, int n){
        if(inx==n) return n_1+n_2 %1234567;
        return fibo(inx+1,(n_1+n_2)%1234567,n_1%1234567,n)%1234567;
    }
}