class TwoSum{
    public static void findtwosum(int[] nums, int target)
    {
        for(int i=0; i<nums.length; i++)
        {
            for (int j=0; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                   System.out.println(nums[i]); 
		   System.out.println(nums[j]);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int nums[]={4,2,7,11,15};
        findtwosum(nums,9);
       // System.out.println(ans);
    }
}
