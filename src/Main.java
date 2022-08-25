import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> eventList = sortEvent(sortPositive(list));

        Collections.sort(eventList);
        System.out.println(eventList);

        StreamMain streamMain = new StreamMain(list);
        streamMain.sortStream();

    }

    public static List<Integer> sortPositive(List<Integer> list) {
        List<Integer> positiveList = new ArrayList<>();
        for (int num : list) {
            if (num > 0) {
                positiveList.add(num);
            }
        }
        return positiveList;
    }

    public static List<Integer> sortEvent(List<Integer> list) {
        List<Integer> evenList = new ArrayList<>();
        for (int num : list) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }
        return evenList;
    }
}
