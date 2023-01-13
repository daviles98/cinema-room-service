import java.util.List;
import java.util.Scanner;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        int countList1 = 0;
        int countList2 = 0;
        for (Integer i : list1) {
            if(i == elem) {
                countList1++;
            }
        }
        for (Integer i : list2) {
            if(i == elem) {
                countList2++;
            }
        }
        return countList1 == countList2;
    }
}