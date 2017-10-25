package BubbleSort;

public class FibCode {

    public static void main(String[] args) {
        int code = new FibCode().fibCode(10);
        System.out.println(code);
    }

    public int fibCode(int elementNumber) {
        if (elementNumber == 0) return 0;
        if (elementNumber == 1) return 1;
        else
            return fibCode(elementNumber - 1) + fibCode(elementNumber - 2);
    }

    public int fibCodeOnLoop(int elementNumber) {
        if (elementNumber == 0) return 0;
        if (elementNumber == 1) return 1;

        int prevEl = 0;
        int currEl = 1;
        int nextEl = prevEl + currEl;
        for (int i = 2; i < elementNumber; i++) {
            prevEl = currEl;
            currEl = nextEl;
            nextEl = prevEl + currEl;
        }
        return nextEl;
    }
}