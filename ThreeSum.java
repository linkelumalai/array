class ThreeSum{
    public static void findtwosum(int[] nums, int target)
    {
        for(int i=0; i<nums.length; i++)
        {
            for (int j=i+1; j<nums.length; j++){
                for (int k=j+1; k<nums.length; k++){
                if(nums[i]+nums[j]+nums[k]==target) {
                   System.out.println(nums[i]); 
		           System.out.println(nums[j]); 
                   System.out.println(nums[k]);
                   System.out.println("\n\n\n");
                   
                }
            }
        }
    }
}
    public static void main(String[] args)
    {
        int nums[]={4,2,7,11,15,3};
        findtwosum(nums,22  );
       // System.out.println(ans);
    }
}
