class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        int sum=0;
        int[] x= new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                    sum=nums[i]+nums[j];
                if(sum==target){
                    x[0]=i;
                    x[1]=j;
                    break;
                }
                else sum=0;
            }
        }
       
        return x;
    }
}
