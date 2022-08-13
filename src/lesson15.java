public class lesson15 {
    public static void main(String[] args) {
        String a = "1111";
        String b = "111";
        String result = "";
        lesson15 lesson15 = new lesson15();
        System.out.println(lesson15.addBinary(a, b, result));
    }

    public String addBinary(String a, String b, String result) {
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        int carry = 0;
        int addNumber = 0;
        while (aLen >= 0 && bLen >= 0) {
            addNumber = Integer.parseInt(String.valueOf(a.charAt(aLen))) + Integer.parseInt(String.valueOf(b.charAt(bLen))) + carry;
            carry = addNumber / 2;
            if (addNumber == 3) {
                result = "1" + result;
            } else if (addNumber == 2) {
                result = "0" + result;
            } else {
                result = addNumber + result;
            }
            aLen--;
            bLen--;

        }
        while (aLen >= 0){
            addNumber = Integer.parseInt(String.valueOf(aLen)) + carry;
            carry = addNumber/2;
            if(addNumber == 2){
                result = "0" + result;
            }else
                result = addNumber + result;
            aLen--;
        }
        while ((bLen >= 0)){
            addNumber = Integer.parseInt(String.valueOf(aLen)) + carry;
            carry = addNumber/2;
            if(addNumber == 2){
                result = "0" + result;
            }else
                result = addNumber + result;
            bLen--;
        }
        return carry == 1 ? carry + result : result;
    }
}
