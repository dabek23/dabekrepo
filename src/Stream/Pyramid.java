package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Pyramid {

    public static void main(String[] args) {
        Pyramid test = new Pyramid();
        test.biggestNumber();
    }

    public void biggestNumber() {
        String input = "5533";
        String collect = Arrays.asList(input.split("")).stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining("\n"));
        System.out.println(collect);
    }
}
