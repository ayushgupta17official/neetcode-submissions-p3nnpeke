    class Solution {

        public int longestConsecutive(int[] nums) {
    
        Set<Integer> set = new HashSet<>();

    for (int num : nums) {
        set.add(num);
    }
            int max=0;
            for(int n:set){
                if(!set.contains(n-1)){
                    int curr =n; 
                int length=1;
                

                while(set.contains(curr+1)){
                    curr++;
                    length++;
                }
                max=Math.max(max,length);
                }
            }
            return max;
        
        }
    }
