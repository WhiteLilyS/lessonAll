import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        boolean isTrue = true;
        while (isTrue) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter please Roman Numerals");
            String enterText = scanner.nextLine();
//            if (enterText.matches("[M|D|C|L|X|V|I]")) {
            System.out.println(enterText);
            System.out.println(romansTranslate(enterText));

//            }
        }

    }

    public static int romansTranslate(String romansNumerals) {
        int resualtRoman = 0;
        for (int i = 0; i < romansNumerals.length(); i++) {
            switch (romansNumerals.charAt(i)){
                case 'M':{
                    if(i > 0 && romansNumerals.charAt(i-1) == 'C')
                        resualtRoman += 800;
                    else
                        resualtRoman += 1000;
                    break;
                }
                case 'D':{
                    if(i > 0 && romansNumerals.charAt(i-1) == 'C')
                        resualtRoman += 300;
                    else resualtRoman += 500;
                    break;
                }
                case  'C':{
                    if(i > 0 && romansNumerals.charAt(i-1) == 'X')
                        resualtRoman += 80;
                    else
                        resualtRoman +=100;
                    break;
                }
                case 'L':{
                    if(i > 0 && romansNumerals.charAt(i-1) == 'X')
                        resualtRoman += 30;
                    else
                        resualtRoman +=50;
                    break;
                }
                case 'X':{
                    if(i > 0 && romansNumerals.charAt(i-1) == 'I')
                        resualtRoman += 8;
                    else
                        resualtRoman +=10;
                    break;
                }
                case 'V':{
                    if(i > 0 && romansNumerals.charAt(i-1) == 'I')
                        resualtRoman +=3;
                    else
                        resualtRoman +=5;
                    break;
                }
                case 'I': {
                    resualtRoman += 1;
                    break;
                }
                default:
                    resualtRoman =0;
            }

        }
        return resualtRoman;
    }
}
//        Map<String,Integer> romanNumerals = new HashMap<>();
//        romanNumerals.put("I",1);
//        romanNumerals.put("V",5);
//        romanNumerals.put("X",10);
//        romanNumerals.put("L",50);
//        romanNumerals.put("C",100);
//        romanNumerals.put("D",500);
//        romanNumerals.put("M",1000);
//
//        int romanResultI = 0;
//        for(int i = 0; i < romansNumerals.length();i++){
//            String romansNumeralsOne = romansNumerals.substring(i,i+1);
//            //System.out.println(romansNumeralsOne);
//
//
//            if(romanNumerals.containsKey(romansNumeralsOne))
//
//                if (romanNumerals.containsKey("V")) {
//
//                    if(romansNumerals.substring(i,i-1).equals("I")){
//                        romanResultI +=(romanNumerals.get(romansNumeralsOne)+3);
//                    }else if(){
//                        romanResultI += romanResultI;
//                    }
//
//                } else if(romanNumerals.containsKey("I")){
//                    romanResultI += romanNumerals.get(romansNumeralsOne);
//                    System.out.println();
//                } else if (romanNumerals.containsKey("X")) {
//                    romanResultI += romanNumerals.get(romansNumeralsOne);
//                } else if (romanNumerals.containsKey("L")) {
//                    romanResultI += romanNumerals.get(romansNumeralsOne);
//                } else if (romanNumerals.containsKey("C")) {
//                    romanResultI += romanNumerals.get(romansNumeralsOne);
//                } else if (romanNumerals.containsKey("D")) {
//                    romanResultI += romanNumerals.get(romansNumeralsOne);
//                } else if (romanNumerals.containsKey("M")) {
//                    romanResultI += romanNumerals.get(romansNumeralsOne);
//
//                }
//
//            //System.out.println(romansNumeralsOne);
//
//        }
//        System.out.println(romanResultI);


