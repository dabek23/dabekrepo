package BubbleSort;

public class SortTest {
    public static void main(String[] args) {
        int[] values = {5, 1, 7, 64, 16, 22, 2};
        BubbleSort sort = new BubbleSort();
        sort.sort(values);
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
