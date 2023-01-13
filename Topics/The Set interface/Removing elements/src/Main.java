import java.util.*;

class SetUtils {

    public static Set<Integer> getSetFromString(String str) {
        Set<Integer> set = new HashSet<>();
        for(String s : str.split(" ")) {
            set.add(Integer.parseInt(s));
        }
        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(x -> x > 10);
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}