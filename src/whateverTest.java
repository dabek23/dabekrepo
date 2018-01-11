import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class whateverTest {
    public static void main(String[] args) {

        Usere lead1 = new Usere("kpum", 44, 99);
        Usere lead2 = new Usere("tpume", 464, 19);
        Usere lead3 = new Usere("kpusm", 434, 293);
        Usere lead4 = new Usere("mpumh", 47, 65);
        Usere lead5 = new Usere("bpumb", 78, 33);

        List<Usere> users = Arrays.asList(lead1, lead2, lead3, lead4, lead5);
        Comparator<Usere> ageTest;

        users.stream().sorted().forEach(c -> System.out.println(c));
        Collections.sort(users);
        Collections.sort(users, new AgeTest());
    }
}
