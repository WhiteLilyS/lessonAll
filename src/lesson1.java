import java.util.*;

public class lesson1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter target");
        int target = scanner.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Enter nums/ Enter word for exit");
        while (scanner.hasNextInt()){
            int i = scanner.nextInt();
            nums.add(i);
        }
        scanner.close();
        System.out.println(target);
        nums.forEach(System.out::println);

        Map<Integer, Integer> finishMap= new HashMap<>();
        System.out.println(Arrays.toString(twoSum(nums, target)));


    }

    public static int[] twoSum(ArrayList<Integer> nums, int target){

        Map<Integer, Integer> map = new HashMap();
        for( int i = 0; i < nums.size();i++){
            map.put(nums.get(i),i);
        }
        System.out.println(map);
        for(int i = 0; i < nums.size();i++ ){
            int complenet = target - nums.get(i);
            System.out.println(nums.get(i));
            System.out.println(map.containsKey(complenet));
            System.out.println(map.get(complenet));
            if(map.containsKey(complenet) && map.get(complenet) != i){
                return new int[] {i, map.get(complenet)};
            }
        }
        return null;
    }
}
