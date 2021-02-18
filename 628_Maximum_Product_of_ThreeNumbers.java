    public int maximumProduct(int[] nums) {
      Arrays.sort(nums);
        int n = nums.length;
        int condidate1 = nums[n -1] * nums[n -2]* nums[n -3];
        int condidate2 = 0;
        if(nums[0] < 0 && nums[1] < 0){
            condidate2 = nums[0]* nums[1]* nums[n - 1];
        }
        return Math.max(condidate1, condidate2);
    }
}