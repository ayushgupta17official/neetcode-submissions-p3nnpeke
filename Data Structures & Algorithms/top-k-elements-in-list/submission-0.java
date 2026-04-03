class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> freq= new HashMap<>();
       List<Integer> [] bucket= new List[nums.length+1];
       for(int x:nums){
        freq.put(x,freq.getOrDefault(x,0)+1);
       }
       for(int n:freq.keySet()){
        int frequency=freq.get(n);
        if(bucket[frequency]==null){
            bucket[frequency]= new ArrayList<>();

        }
        bucket[frequency].add(n);
       }

       int[] res=new int[k];
        int counter=0;
       for(int pos=bucket.length-1;pos>=0 && counter<k;pos--){
        if(bucket[pos] != null){
            for(Integer integer : bucket[pos]){
                res[counter++]=integer;
            }
        }
       }
        return res;
    }
}
