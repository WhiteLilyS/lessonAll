public class lesson12 {
//    String s;
    public static void main(String[] args) {
        String s = "Hello World";
        lesson12 lesson12 = new lesson12();
        lesson12.lengthOfLastWord(s);
    }
//    public boolean equals(lesson12 lesson12){
//        return  this.s == lesson12.s;
//    }

    public void lengthOfLastWord(String s){
        int k=0;
//        System.out.println(s.length());
        for (int i = s.length()-1; i >= 0; i--) {

            System.out.println(s.charAt(i));
            Character word = s.charAt(i);
            if(word.equals(' ')){
                break;
            }else
                k++;
        }
        System.out.println(k);
    }
}
