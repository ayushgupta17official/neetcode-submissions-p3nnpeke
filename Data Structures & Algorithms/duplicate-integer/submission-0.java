class Solution {
    public boolean hasDuplicate(int[] nums) {
      int len=nums.length;
      HashSet<Integer> set = new HashSet<>();
      for(int i=0;i<len;i++){
        set.add(nums[i]);
      }
      if(len>set.size()){
        return true;
      }
      else return false;
    }
}