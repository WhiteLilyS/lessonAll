public class lesson10 {
    public static void main(String[] args) {
        String haystack = "aaaaa";
        String needle = "bba";
        lesson10 lesson10 = new lesson10();
        lesson10.implementStr(haystack,needle);
    }

    public void implementStr(String haystack,String needle){
        int k=0;
            for (int j = 0; j < needle.length(); j++) {
                if(haystack.indexOf(needle.charAt(j)) >= 0){
                    k++;
                }
                else
                    k--;
            }

        System.out.println(k);
    }


}
