import java.util.stream.Collectors;

public class StringMethods
{
    public static void main(String[] args)
    {
        String blank = "";
        System.out.println(blank.isBlank());

        String non_blank = " DeV";
        System.out.println(non_blank.isBlank());

        String lines = "BA\nDev\nQA";
        System.out.println(lines.lines().collect(Collectors.toList()));

        String repeat = "reps ";
        System.out.println(repeat.repeat(3));

        String strip_string = " strip leading and trailing ";
        System.out.println(strip_string.stripLeading().stripTrailing().strip());
    }
}