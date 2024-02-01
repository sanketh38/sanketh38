class removeduplicates{
public int removeDuplicates(int[] nums) {
        int x = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[x]){
                x++;
                int a=nums[i];
                nums[i]=nums[x];
                nums[x]=a;
            }
        }
        return x+1;
}
}
