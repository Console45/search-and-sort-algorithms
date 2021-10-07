public class Search {
    public static void linear(int[] arr, int key) {
        long startTime = System.nanoTime();
        long endTime, runtime;
        int searchElementIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                searchElementIndex = i;
            }
        }
        if (searchElementIndex == -1) {
            System.out.println("Element not found in Array");
            endTime = System.nanoTime();
            runtime = endTime - startTime;
            System.out.println("runtime = " + runtime + "ns");
        } else {
            System.out.println("Element found at index " + searchElementIndex + "\nValue = " + arr[searchElementIndex]);
            endTime = System.nanoTime();
            runtime = endTime - startTime;
            System.out.println("runtime = " + runtime + "ns");

        }
        System.out.println("Time complexity = O(n)");

    }

    public static void binary(int[] arr, int key) {
        long startTime = System.nanoTime();
        long endTime, runtime;
        int first = 0;
        int last = arr.length - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index " + mid + "\nValue = " + arr[mid]);
                endTime = System.nanoTime();
                runtime = endTime - startTime;
                System.out.println("runtime = " + runtime + "ns");
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found in array");
            endTime = System.nanoTime();
            runtime = endTime - startTime;
            System.out.println("runtime = " + runtime + "ns");
        }
        System.out.println("Time complexity = O(log n)");
    }
}