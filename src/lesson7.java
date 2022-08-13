import java.util.ArrayList;
import java.util.Arrays;

public class lesson7 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1,1,1, 2, 2, 3, 3, 4,4};
        lesson7 lesson7 = new lesson7();
        lesson7.deleteDublicate(nums);
    }

    public void deleteDublicate(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i] != nums[i + 1]) {
                nums[k++] = nums[i];
            }
        }
        nums[k++] = nums[nums.length-1];
        System.out.println(Arrays.toString(nums) + " " + k);
    }
//        for (int i = 0; i < nums.length; i++) {
//            {
//
//                for (int j = 0; j < nums.length - 1; j++) {
//                    if (nums[j] >= nums[j + 1]) {
//                        int temp = nums[j + 1];
//                        nums[j + 1] = nums[j];
//                        nums[j] = temp;
//                    }
//                }
}




