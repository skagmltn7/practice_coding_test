class Solution {
    public int removeElement(int[] nums, int val) {
        int inx = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=val){
                nums[inx++]=nums[i];
            }
        }
        return inx;
    }
}