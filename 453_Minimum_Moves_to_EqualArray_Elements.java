    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = 0;
        for(int i = n - 1; i > 0 ; i--){
            res += nums[i] - nums[0];
        }
        return res;
    }
}