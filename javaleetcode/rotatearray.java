class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length<=k){k=(k%nums.length);}
       int x=nums.length-k;
       int z=nums.length-1;
       //reversing the last k elements in the array
       for(int i=0;i<(k/2);i++){
           int a=nums[x];
           nums[x]=nums[z];
           nums[z]=a;
           x++;
           z--;
       }
       //reversing the first remaining elements in the array
       x=nums.length-k;
       z=x-1;
       for(int i=0;i<(x/2);i++){
           int a = nums[i];
           nums[i]=nums[z];
           nums[z]=a;
           z--;
       }
       //finally, reversing the entire array
       int n=nums.length;
       z=n-1;
       for(int i=0;i<n/2;i++){
           int a=nums[i];
           nums[i]=nums[z];
           nums[z]=a;
           z--;
       }
    }
}
