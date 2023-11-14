package W04;

import java.util.Arrays;

public class Recursion {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1};
        //int[] arr = new int[]{};
        //gnomeSort(arr);
        //System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(partition(arr, 0, 4)));

    }

    public static void gnomeSort(int[] arr) {
        gnomeSort(arr, 0);
    }

    public static void gnomeSort(int[] arr, int position) {

        if (position >= arr.length) {
            return;
        }
        if (position == 0) {
            gnomeSort(arr, position + 1);
        } else if (position > 0 && arr[position] >= arr[position - 1]) {
            gnomeSort(arr, position + 1);
        } else if (position > 0) {
            swap(arr, position, position - 1);
            gnomeSort(arr, position - 1);
        }
    }

    public static void swap(int[] arr, int i, int j) {

        if (i < 0 || i >= arr.length) {
            throw new IndexOutOfBoundsException("Index i: " + i + " is out of bounds for length: " + arr.length);
        }

        if (j < 0 || j >= arr.length) {
            throw new IndexOutOfBoundsException("Index j: " + j + " is out of bounds for length: " + arr.length);
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static int[] partition(int[] arr, int from, int to) {
        return Arrays.copyOfRange(arr, from, to);
    }

    public static int[] merge(int[] first, int[] second) {
        return null;
    }

    public static int[] mergeSort(int[] array) {

        if (array.length == 1) {
            return array;
        }

        int middle = array.length / 2;
        int[] left = partition(array, 0, middle);
        int[] right = partition(array, middle, array.length);

        return merge(mergeSort(left), mergeSort(right));
    }










    /*
     * fac(5) => 5 * fac(4) => 5 * 4 * fac(3) => ... 5 * 4 * 3 * 2 * 1 * 1
     *
     * */

    void foo() {
        foo();
    }

    int fac(int n) {
        // Base Case
        if (n == 0) {
            return 1;
        }
        return n * fac(n - 1);
    }

    int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    int differenceAsBs(char[] word) {
        return differenceAsBs(word, 0);
    }

    int differenceAsBs(char[] word, int from) {
        if (from < 0 || from >= word.length) {
            return 0;
        }
        if (word[from] == 'A') {
            return 1 + differenceAsBs(word, from + 1);
        } else if (word[from] == 'B') {
            return differenceAsBs(word, from + 1) - 1;
        }
        return 0;
    }
}
