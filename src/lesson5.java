import java.util.HashMap;
import java.util.Map;

public class lesson5 {
    public static void main(String[] args){
        String s = "()[]{}";
        checkBrackets(s);
    }
    public static void checkBrackets(String brackets){
        Map<Character,Character> hashMap = new HashMap<>();
        hashMap.put(']','[');
        hashMap.put('}','{');
        hashMap.put(')','(');
        boolean result = false;
        for (int i = 0; i < brackets.length(); i++) {
           if(hashMap.containsKey(brackets.charAt(i))){
               if(brackets.lastIndexOf(hashMap.get(brackets.charAt(i)),brackets.charAt(i)) >= 0)
                   result = true;
                   System.out.println(brackets.charAt(i));
           }else
               result = false;
            
        }
        System.out.println(result);
    }
}
