import java.util.LinkedList;
import java.util.List;

public class lesson18 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        for (int i = 0; i < 7; i++) {
            l1.add(9);
        }
        LinkedList<Integer> l2 = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            l2.add(9);
        }
        lesson18 lesson18 = new lesson18();
        System.out.println(lesson18.addTwoNumbers(l1, l2));
    }

    public List<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        int l1Line = l1.size() - 1;
        int l2Line = l2.size() - 1;
        int carry = 0;
        int changeNumber = 0;
        LinkedList<Integer> result = new LinkedList<>();

        while (l1Line >= 0 && l2Line >= 0) {
            result.add((l2.get(l2Line) + l1.get(l2Line) + carry) % 10);
            carry = (l2.get(l2Line) + l1.get(l2Line)) / 10;
            l1Line--;
            l2Line--;
        }
        while (l1Line >= 0) {

            if ((l1.get(l1Line) + carry) > 9) {
                result.add((l1.get(l1Line) + carry) % 10);
                carry = (l1.get(l1Line) / 10 + carry);
            } else {
                result.add(l1.get(l1Line) + carry);
                carry = 0;
            }
            l1Line--;

        }
        while (l2Line >= 0) {
            if ((l2.get(l2Line) + carry) > 9) {
                result.add((l2.get(l2Line) + carry) % 10);
                carry = (l2.get(l2Line) / 10 + carry);
            } else {
                result.add(l2.get(l2Line) + carry);
                carry = 0;
            }
            l2Line--;

        }
        if (carry > 0)
            result.add(carry);
        return result;
    }
}
