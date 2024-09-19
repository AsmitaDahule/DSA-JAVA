class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,4,5,5,5,5,7,};
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }
    static int removeDuplicates(int[] nums) {
        
        if(nums.length==0)
        {
            return 0;
        }

        int unique = 0;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[unique])
            {
                unique++;
                nums[unique] = nums[i];
            }
        }

        return unique+1;


    }
}