package BubbleSort;

public class BubbleSort {

    public void sort(int[] values) {

        boolean swap = false;
        int temp;

        while (swap == true) {
            for (int i = 0; i < values.length -1; i++) {
                if (i == values.length) {
                    swap = false;
                    for (int j = 0; j < values.length -1; j++) {
                        if (values[i]>values[i+1]) {
                            temp = values[i+1];
                            values[i+1] = values[i];
                            values[i] = temp;
                        }
                    }
                }
            }
        }
    }
}