public class User implements Comparable<User> {

    String name;
    int weight;
    int age;

    public User(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        int compare = name.compareTo(o.name);
        if (compare != 0) return compare;
        int compareWeight = weight - o.weight;
        if (compareWeight != 0) return weight;
        return compareWeight;
    }
}