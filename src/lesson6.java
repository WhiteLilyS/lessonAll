import java.util.LinkedList;

public class lesson6 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);

        lesson6 lesson6 = new lesson6();
        lesson6.sortList(list1, list2);
    }

    public void sortList(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        list1.addAll(list2);
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list1.size()-1; j++) {
                if (list1.get(j) > list1.get(j+1)) {
                    Integer temp = list1.get(j+1);
                    list1.set(j+1, list1.get(j));
                    list1.set(j, temp);
                }
            }
        }


//            for (int j = 0; j < list2.size(); j++) {
//                if(list1.get(i) > list2.get(j)){
//                    Object temp = list1.get(i);
////                    list1.remove(list1.indexOf(i));
//                    list3.add(list1.indexOf(temp),list2.get(j));
//                }else if(list1.get(i) <= list2.get(i)){
//                    list3.add(list2.get(j));
//                }
//            }

        System.out.println(list1);
    }
}
