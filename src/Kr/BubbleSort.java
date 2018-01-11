package Kr;

public class BubbleSort implements SortingAlgorithm {

    @Override

    public SortingResult sort(int[] data) {

        int swapsQuantity = 0;
        int iterationQuantity = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                iterationQuantity++;
                if (data[j] > data[j + 1]) {
                    swapsQuantity++;
                    swap(data, j, j + 1);
                }
            }
        }
        return new SortingResult(data, swapsQuantity, iterationQuantity);
    }
}