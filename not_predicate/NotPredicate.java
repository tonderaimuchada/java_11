import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotPredicate {
    public static void main(String[] args) {
        List<String> sampleList = Arrays.asList("Java", "\n \n", "Python", " ");
        List<String> withoutBlanks = sampleList.stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());
        for (String element : withoutBlanks) {
            System.out.println(element);
        }
    }
}