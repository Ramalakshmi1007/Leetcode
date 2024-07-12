class Solution
 {
    public int[] twoSum(int[] nums, int target) 
    {
        int i,sum;
        for ( i = 0; i < nums.length-1; i++) 
        {
            for(int j=i+1;j<nums.length;j++)
            {
            sum = nums[i] + nums[j];
            if (sum == target)
            {
                return new int[]{i, j};
            }
            }
        }
        if((nums[i]+nums[0])==target)
        return new int[]{0, i};
        return new int[]{-1,-1};

    }
}