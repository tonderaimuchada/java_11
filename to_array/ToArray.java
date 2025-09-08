import java.util.List;
import java.util.Arrays;

public class ToArray {
    public static void main(String[] args) {
        List<String> sampleList = Arrays.asList("Java", "Kotlin");
        String[] sampleArray = sampleList.toArray(String[]::new);
    }
}