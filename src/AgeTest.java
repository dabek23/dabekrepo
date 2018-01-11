import java.util.Comparator;

public class AgeTest implements Comparator<Usere> {
    @Override
    public int compare(Usere o1, Usere o2) {
        return o1.age-o2.age;

    }
}
