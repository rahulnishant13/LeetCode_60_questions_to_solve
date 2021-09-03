package LeetCode_Questions;

public class MissingElementInSortedArray {
    public static void main (String[] args) {
        int [] nums = {4, 6, 7, 9, 11};
        int k = 3;
        if(k <= (nums[nums.length-1] - nums[0] - (nums.length -1))){
            int result = getMissingNumber(nums, k, 0, nums.length-1);
            if(result != -1) {
                System.out.println(result);
            } else {
                System.out.println("not found");
            }
        } else{
            System.out.println("not found");
        }
    }

    private static int getMissingNumber(int [] nums, int k, int low, int high){
        if(low > high) {
            return -1;
        }
        int mid = (low + high)/2;
        int missingEle = ((nums[mid] - nums[low]) - (mid - low));

        if(missingEle <= 0){
            return nums[mid] + k;
        }

        if (missingEle < k){
            return getMissingNumber(nums, k-missingEle, mid, high);
        }
        return getMissingNumber(nums, k, low, mid);
    }
}
