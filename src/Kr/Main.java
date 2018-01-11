package Kr;

import Kr.BubbleSort;
import Kr.DataSets;
import Kr.InsertionSort;
import Kr.QuickSort;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] dataRandom = DataSets.random(20, 20, new Random(42));
        int[] dataAscending = DataSets.ascending(20);
        int[] dataDescending = DataSets.ascending(20);

        BubbleSort bubbleSort = new BubbleSort();
        int[] dataBubble = Arrays.copyOf(dataRandom, dataRandom.length);
        SortingResult bubbleSortResult = bubbleSort.sort(dataBubble);
        System.out.println(bubbleSortResult);

        InsertionSort insertionSort = new InsertionSort();
        int[] dataInsertion = Arrays.copyOf(dataRandom, dataRandom.length);
        SortingResult insertionSortResult = insertionSort.sort(dataInsertion);
        System.out.println(insertionSortResult);

//        int resultSwaps = new BubbleSort().sort(dataRandom).getSwapsQuantity();
//        int resultIterations = new BubbleSort().sort(dataRandom).getIterationQuantity();
//        System.out.println(Arrays.toString(dataRandom));
//        new BubbleSort().sort(dataRandom);
//        System.out.println(Arrays.toString(dataRandom));
//        System.out.println(resultSwaps);
//        System.out.println(resultIterations);
//        System.out.println("-----------------------");

//        data = DataSets.random(20, 20, new Random(42));
//        System.out.println(Arrays.toString(data));
//        new InsertionSort().sort(data);
//        System.out.println(Arrays.toString(data));
//        System.out.println("-----------------------");
//
//        data = DataSets.random(20, 20, new Random(42));
//        System.out.println(Arrays.toString(data));
//        new QuickSort().sort(data);
//        System.out.println(Arrays.toString(data));
    }
}