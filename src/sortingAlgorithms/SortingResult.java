package Kr;

import java.util.Arrays;

public class SortingResult {
    private final int[] data;
    private final int swapsQuantity;
    private final int iterationQuantity;

    public SortingResult(int[] data, int swapsQuantity, int iterationQuantity) {
        this.data = data;
        this.swapsQuantity = swapsQuantity;
        this.iterationQuantity = iterationQuantity;
    }

    public int[] getData() {
        return data;
    }

    public int getSwapsQuantity() {
        return swapsQuantity;
    }

    public int getIterationQuantity() {
        return iterationQuantity;
    }

    @Override
    public String toString() {
        return "SortingResult{" +
                "data=" + Arrays.toString(data) +
                ", \nswapsQuantity=" + swapsQuantity +
                ", \niterationQuanity=" + iterationQuantity +
                '}';
    }
}