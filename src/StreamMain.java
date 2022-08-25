import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    List<Integer> list;

    public StreamMain(List<Integer> list) {
        this.list = list;
    }

    public void sortStream() {
        List<Integer> eventList = list.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(eventList);
    }
}
