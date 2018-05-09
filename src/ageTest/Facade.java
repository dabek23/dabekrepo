package ageTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class whateverTest {
    public static void main(String[] args) {

        User lead1 = new User("Spleen", 44, 99);
        User lead2 = new User("Spin", 64, 19);
        User lead3 = new User("Steam", 34, 23);
        User lead4 = new User("Seem", 47, 65);
        User lead5 = new User("Seen", 78, 33);

        List<User> users = Arrays.asList(lead1, lead2, lead3, lead4, lead5);

        users.stream().sorted().forEach(c -> System.out.println(c));
        Collections.sort(users);
        Collections.sort(users, new AgeTest());
    }
}
