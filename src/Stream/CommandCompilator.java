package Stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CommandCompilator {
    public String compileCommand(String command) {
        String[] com = command.split("");
        String comm = Arrays.stream(com)
                .map(String::toLowerCase)
                .map(s -> s.replaceAll("[^mlp]", ""))
                .collect(Collectors.joining());
        return comm;
    }
}