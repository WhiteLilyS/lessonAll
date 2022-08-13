import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        String[] strs = new String[]{"flower", "flow", "flight"};
//        for(int i = 0; i<3 ; i++){
//            strs[i] = scanner.nextLine();
//        }
        lesson4 lesson4 = new lesson4();
        System.out.println(lesson4.getMaxPrefix(strs));
    }

    public String getMaxPrefix(String[] wordForGetPrefix) {
//        if (wordForGetPrefix.length == 0) {
//            return "";
//        }
//        for (int i = 0; i < wordForGetPrefix.length - 1; i++) {
//
//            for (int j = i + 1; j < wordForGetPrefix.length; j++) {
//                if (wordForGetPrefix[i].length() > wordForGetPrefix[j].length()) {
//                    String temp = wordForGetPrefix[i];
//                    wordForGetPrefix[i] = wordForGetPrefix[j];
//                    wordForGetPrefix[j] = temp;
//                }
//            }
//
//        }
//        StringBuffer result = null;
//        for (int i = 1; i <= wordForGetPrefix[0].length(); i++) {
//            String word = wordForGetPrefix[0].substring(0, i);
//            for (int j = 1; j < wordForGetPrefix.length; j++) {
//                if (word.equals(wordForGetPrefix[j].substring(0, 1))) {
//                   j++;
//                }else if(word.equals((wordForGetPrefix[j].substring(0,2))))
//        }
//        System.out.println(Arrays.toString(wordForGetPrefix));
        String prefix = wordForGetPrefix[0];
        for (var str : wordForGetPrefix){
            while(str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
//        return null;
    }

}
