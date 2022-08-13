import java.util.ArrayList;

public class lesson2 {
    public static void main(String[] args){
        //Not relevant
        //fixed in lesson18
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(9);
        l2.add(9);
        l2.add(9);
        l2.add(9);
        ArrayList<Integer> l3 = new ArrayList<>();
        int saveNumberInNimd = 0;
        for(int  j = 0; j< l2.size();j++){
            for(int i = 0; i< l1.size();i++){

                if(i == j){
                    int sum = l1.get(i)+l2.get(j);

                    if(sum >=10 && saveNumberInNimd == 0){
                        l3.add(sum%10);
                        int numberInNimd =sum/10;
                        saveNumberInNimd = numberInNimd;
                    }
                    else if(sum <= 10 && saveNumberInNimd >0 ) {
                        l3.add(sum + saveNumberInNimd);
                        saveNumberInNimd = 0;
                    }
                    else if(sum <=10 && saveNumberInNimd == 0){
                        l3.add(sum);

                    }
                }
            }
        }
        System.out.println(l3);
    }
}
