class Solution {
    public int findMin(int[] nums) {
        int max= Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<max){
                max=nums[i];
            }
        }
        return max;
    }
}
