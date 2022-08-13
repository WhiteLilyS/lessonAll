import java.sql.SQLOutput;

public class lesson14 {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(a);
        System.out.println(b);
        lesson14 lesson14 = new lesson14();
        lesson14.addBinary(a, b);
    }

    public void addBinary(String a, String b) {
          int a1 = Integer.parseInt(a);
          int b1 = Integer.parseInt(b);
          System.out.println(a+b);
//        int k = 0;
//        for (int i = a.length() - 1; 0 <= i; i--) {
//
//
//            if (i - (b.length() - 1) <=0) {
//                k = b.charAt(i) - '0';
//
////                System.out.println(k);
//            }
//            else {
//                k = 0;
////                System.out.println(k);
//            }
//
//
//            if(i-1>=0) {
//
//                if (a.charAt(i) + k -'0' > 1) {
//                    a.replace((char) i, (char) ((10 + k) % 10));
//                    a.replace((char) (i - 1), (char) ( ((10 + k) / 10) + a.charAt(i-1)));
//                }else if(a.charAt(i) + k -'0' <= 1)
//                    if(a.charAt(i)-'0'<k){
//                        a.replace((char) i, (char) k);
//                    }else
//                        a.replace((char) i,a.charAt(i));
//            }
//
//        }
//        System.out.println(a);

    }
}
