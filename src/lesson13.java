import java.util.ArrayList;

public class lesson13 {
    public static void main(String[] args) {
        ArrayList<Integer> digits = new ArrayList<>();
        digits.add(9);
        digits.add(9);
        digits.add(9);
//        digits.add(1);
        int k = 1;
        lesson13 lesson13 = new lesson13();
        lesson13.plusOne(k, digits);
    }

    public void plusOne(int k, ArrayList<Integer> digits) {
////        int digitsSize = digits.size();
////        for (int i = 0; i < digits.size(); i++) {
////        for (int j = digits.size() - 1; 0 <= j; j--) {
//
//           /* if (digitsSize < digits.size()) {
//
//                j = 0;
//                digitsSize = digits.size();
////            }*/
////            if (digits.get(j) + k >= 10) {
////                int temp = (digits.get(j) + k) / 10;
////                if (j - 1 < 0) {
////
////                    digits.set(j, (digits.get(j) + k) % 10);
////                    digits.add(0, temp);
////                } else {
////
////                    digits.set(j, (digits.get(j) + k) % 10);
////                    digits.set(j + 1, digits.get(j + 1) + temp);
////                }
////
////            } else
////
////                else if (digits.get(j) +k <10 && digits.get(j) == digits.get(digits.size()-1)){
////
////                    digits.set(j,digits.get(j)+k);
////                }
////            }
//        }
//        System.out.println(digits.get(digits.size() - 1));
//        System.out.println(digits);

        digits.set(digits.size()-1,digits.get(digits.size()-1)+k);

        for (int i = digits.size()-1; 0 <= i; i--) {
            if(digits.get(i) > 9 && digits.get(i) != digits.get(0)){
                int temp = digits.get(i)/10;
                digits.set(i,digits.get(i)%10);
                digits.set(i-1,digits.get(i-1) + temp);

            }else{
                int temp1 = digits.get(i) / 10;
                if(digits.get(i) >9) {
                    digits.set(i, digits.get(i) % 10);
                    digits.add(0, temp1);
                }
            }
        }
        System.out.println(digits);
    }
}
