public class lesson8 {
    public static void main(String[] args) {
        int k=11;
        int[] mass = new int[]{-1,5,6,7,10};
        lesson8 lesson8 = new lesson8();
        lesson8.getTwoSum(mass,k);
    }

    public  void getTwoSum(int[] mass, int k){
        int memorizeNumber = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length-1; j++) {
                memorizeNumber = mass[i];
                if(memorizeNumber + mass[j] == k){

                        System.out.println(memorizeNumber + " " + mass[j]);
                }
            }
        }
    }
}
