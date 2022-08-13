import java.util.regex.Pattern;

public class lesson19 {
    public static void main(String[] args) {
        String s = "pwwkew";
        lesson19 lesson19 = new lesson19();
        System.out.println(lesson19.getLength(s));
    }

    public int getLength(String s) {
        int k = 0;
        String text = "";
        int transfer = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                if (transfer < k) {
                    transfer = k;
                    text = String.valueOf(s.charAt(i));
                    k = 1;

                } else if (k == 0) {
                    text = String.valueOf(s.charAt(i));
                    k++;
                }
            } else {
                if (text.contains(String.valueOf(s.charAt(i)))) {
                    if (transfer < k) {
                        text = String.valueOf(s.charAt(i));
                        transfer = k;
                        k = 1;
                    }
                } else {
                    text = text + s.charAt(i);
                    k++;
                }
            }
        }
        return k;

    }
}
