import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(4,2,5,6,8,7,9,3);

      List<Integer> l2 = l1.stream().filter(e->e%2==0).toList();
              l1.stream().forEach(System.out::println);
        System.out.println(l2);
    }
}
