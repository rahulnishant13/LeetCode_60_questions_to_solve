// https://leetcode.com/problems/next-permutation/?envType=problem-list-v2&envId=5go9wqm5

class NextPermutation {
    public void nextPermutation(int[] nums) {
        int firstDecreasing = 0;
        int i = nums.length-2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }

        if(i >= 0 ){
            int j = nums.length-1;
            while(j > i && nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }

        reverse(nums, i+1);
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start){
        int end = nums.length-1;
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

}
