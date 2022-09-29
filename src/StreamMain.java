import java.util.*;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Comparator<Integer> comparator = (o1, o2) -> (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
        Stream<Integer> stream = intList.stream();
        stream.filter(value -> value > 0).filter(value -> value % 2 == 0).sorted(comparator).forEach(System.out::println);
    }
}
