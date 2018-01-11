package Stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        String output = Arrays.asList("Listę","Stringów" ,"ma" ,"wyświetlić" ,"po" ,"przecinkach" ,"jako" ,"jeden" ,"string" ).stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.println(output);
    }
}