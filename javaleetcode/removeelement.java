class removeelement{
public int removeElement(int[] nums, int val) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                int a =nums[i];
                nums[i]=nums[x];
                nums[x]=a;
                x++;
            }
        }
        return x;
    }
}

