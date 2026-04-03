
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums); // sort the array to handle duplicates easily
        List<List<Integer>> resultList = new ArrayList<>();
        Set<List<Integer>> resultSet = new HashSet<>(); // to avoid duplicates

        int n = nums.length;

        // outer loop to fix one element (left)
        for (int left = 0; left < n - 2; left++) {

            int right = n - 1;

            // move right pointer inward
            while (left < right) {

                for (int i = left + 1; i < right; i++) {

                    int sum = nums[left] + nums[i] + nums[right];

                    if (sum == 0) {
                        // create a new triplet
                        List<Integer> temp = Arrays.asList(nums[left], nums[i], nums[right]);
                        // add to set to avoid duplicates
                        resultSet.add(temp);
                    }
                }

                // move right pointer inward
                right--;
            }
        }

        // convert set to list
        resultList.addAll(resultSet);
        return resultList;
    }
}