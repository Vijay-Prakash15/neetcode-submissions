class Solution {
    public int[] twoSum(int[] nums, int x) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(x - nums[i])){
                ans[0] = map.get(x - nums[i]);
                ans[1] = i;
                return ans;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
