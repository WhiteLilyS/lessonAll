import java.util.Arrays;

public class lesson9 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,2,3};
        int k = 3;
        lesson9 lesson9 = new lesson9();
        lesson9.deleteIndicatedNumber(arr,k);
    }
    public void deleteIndicatedNumber(int[] arr,int k){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == k){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }
        }
        if(arr[arr.length-1] == k){
            arr[arr.length-1] = 9;
        }
        System.out.println(Arrays.toString(arr));
    }
}
