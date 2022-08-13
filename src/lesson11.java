public class lesson11 {
    public static void main(String[] args) {
        int targer = 10;
        Integer[] nums = new Integer[]{1, 3, 5, 6, 7, 8, 9};
        lesson11 lesson11 = new lesson11();
        lesson11.searchInsertIndex(nums, targer);
    }

    public void searchInsertIndex(Integer[] nums, int target) {
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < target && nums[i + 1] > target && nums[i] != target) {
                System.out.println(i + 1);
            } else if (nums[i] == target) {
                System.out.println(i);

            }
            k++;
        }
        if (nums[nums.length - 1] != target && nums[nums.length - 2] < target) {
            System.out.println(k+1);
        }
    }
}
