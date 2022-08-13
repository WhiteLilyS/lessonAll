public class lesson20 {
    public static void main(String[] args) {
        String[] s = new String[]{"b","a","b","a","d"};
        lesson20 lesson20 = new lesson20();
        System.out.println(lesson20.getLongestPalindromicString(s));
    }

    public String getLongestPalindromicString(String[] s) {
        int k = 0;
        int transfer = 0;
        int indexStart = 0;
        int indexEnd = 0;
        String palindrome = "";
        StringBuilder text = new StringBuilder();
        String result = "";

        for (String s1 : s){

            if(isPalindrom(s1)&& s1.length()>k){
                k = s1.length();
                palindrome = s1;
            }


        }
        if(palindrome.equals("")){
            System.out.println("no palin");
        }else
            System.out.println(palindrome);
        return palindrome;
    }

    public  static  boolean isPalindrom(String s){
        return (s.equals(new StringBuilder(s).reverse().toString()));
    }
}


