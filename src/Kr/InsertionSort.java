package Kr;

public class InsertionSort implements SortingAlgorithm {

    @Override

    public SortingResult sort(int[] data) {

        int swapsQuantity = 0;
        int iterationQuantity = 0;

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                iterationQuantity++;
                if (data[j] < data[j - 1]) {
                    swapsQuantity++;
                    swap(data, j, j - 1);
                }
            }
        }
        return new SortingResult(data, swapsQuantity, iterationQuantity);
    }
}