import java.util.Arrays;

public class Sort {

    public static void quick(int arr[]) {
        long startTime = System.nanoTime();
        long endTime, runtime;
        int low = 0;
        int high = arr.length - 1;
        Utils.quickSortRecursion(arr, low, high);
        System.out.println("Sorted array " + Arrays.toString(arr));
        endTime = System.nanoTime();
        runtime = endTime - startTime;
        System.out.println("Runtime = " + runtime + "ns");
        System.out.println("Time complexity = O(nlog n)");
    }

    public static void insertion(int arr[]) {
        long startTime = System.nanoTime();
        long endTime, runtime;
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > key)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
        System.out.println("Sorted array " + Arrays.toString(arr));
        endTime = System.nanoTime();
        runtime = endTime - startTime;
        System.out.println("Runtime = " + runtime + "ns");
        System.out.println("Time complexity = O(n²)");
    }

    static void shell(int[] arr) {
        long startTime = System.nanoTime();
        long endTime, runtime;
        int i, j, k, tmp;
        int num = arr.length;
        for (i = num / 2; i > 0; i = i / 2) {
            for (j = i; j < num; j++) {
                for (k = j - i; k >= 0; k = k - i) {
                    if (arr[k + i] >= arr[k])
                        break;
                    else {
                        tmp = arr[k];
                        arr[k] = arr[k + i];
                        arr[k + i] = tmp;
                    }
                }
            }
        }
        System.out.println("Sorted array " + Arrays.toString(arr));
        endTime = System.nanoTime();
        runtime = endTime - startTime;
        System.out.println("Runtime = " + runtime + "ns");
        System.out.println("Time complexity = O(n²)");

    }

    static void bubble(int[] arr) {
        long startTime = System.nanoTime();
        long endTime, runtime;
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println("Sorted array " + Arrays.toString(arr));
        endTime = System.nanoTime();
        runtime = endTime - startTime;
        System.out.println("Runtime = " + runtime + "ns");
        System.out.println("Time complexity = O(n²)");
    }

    public static void selection(int[] arr) {
        long startTime = System.nanoTime();
        long endTime, runtime;
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        System.out.println("Sorted array " + Arrays.toString(arr));
        endTime = System.nanoTime();
        runtime = endTime - startTime;
        System.out.println("Runtime = " + runtime + "ns");
        System.out.println("Time complexity = O(n²)");
    }

    public static void merge(int[] arr) {
        long startTime = System.nanoTime();
        long endTime, runtime;
        int low = 0;
        int high = arr.length - 1;
        Utils.mergeSortRecursion(arr, low, high);
        System.out.println("Sorted array " + Arrays.toString(arr));
        endTime = System.nanoTime();
        runtime = endTime - startTime;
        System.out.println("Runtime = " + runtime + "ns");
        System.out.println("Time complexity = O(nlog n)");
    }

    static void radix(int arr[]) {
        long startTime = System.nanoTime();
        long endTime, runtime;
        int m = Utils.getMax(arr);
        for (int exp = 1; m / exp > 0; exp *= 10)
            Utils.countSort(arr, exp);
        System.out.println("Sorted array " + Arrays.toString(arr));
        endTime = System.nanoTime();
        runtime = endTime - startTime;
        System.out.println("Runtime = " + runtime + "ns");
        System.out.println("Time complexity = O(d*(n+b))");
    }
}