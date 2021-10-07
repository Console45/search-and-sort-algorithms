import java.util.Scanner;
import java.util.Arrays;

class Main {
    static int[] getArrayInput() {
        System.out.println("Enter total length of elements");
        Scanner searchInput1 = new Scanner(System.in);
        int n = searchInput1.nextInt();
        int arr[] = new int[n];
        System.out.println("\nEnter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = searchInput1.nextInt();
        }
        System.out.println("\nArray " + Arrays.toString(arr));
        searchInput1.close();
        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Searching and Sorting Algorithms Program");
        System.out.println("What algorithm type do you want");
        System.out.println("1: Searching");
        System.out.println("2: Sorting");
        System.out.println("0: To exit");
        String[] sortingAlgo = { "Insertion Sort", "Selection Sort", "Shell Sort", "Quick Sort", "Radix Sort",
                "Bubble Sort", "Merge Sort" };
        while (true) {
            char choice = input.next().charAt(0);
            switch (choice) {
                case '1':
                    System.out.println("\nSearching Algorithms");
                    System.out.println("1: Linear Search");
                    System.out.println("2: Binary Search");
                    Scanner searchInput = new Scanner(System.in);
                    char searchChoice = searchInput.next().charAt(0);
                    switch (searchChoice) {
                        case '1':
                            System.out.println("\nLinear Search");
                            int[] arr = getArrayInput();
                            System.out.println("\nEnter search key");
                            Scanner searchKey = new Scanner(System.in);
                            Search.linear(arr, searchKey.nextInt());
                            System.exit(0);
                            break;
                        case '2':
                            System.out.println("\nBinary Search");
                            int[] arr1 = getArrayInput();
                            System.out.println("\nEnter search key");
                            Scanner searchKey1 = new Scanner(System.in);
                            Search.binary(arr1, searchKey1.nextInt());
                            System.exit(0);
                            break;
                        default:
                            continue;
                    }
                    break;
                case '2':
                    System.out.println("\nSorting Algorithms");
                    for (int i = 0; i < sortingAlgo.length; i++) {
                        System.out.println(i + 1 + ": " + sortingAlgo[i]);
                    }
                    Scanner sortInput = new Scanner(System.in);
                    char sortChoice = sortInput.next().charAt(0);
                    int index = Character.getNumericValue(sortChoice) - 1;
                    switch (sortChoice) {
                        case '1':
                            System.out.println("\n" + sortingAlgo[index]);
                            int[] arr = getArrayInput();
                            Sort.insertion(arr);
                            System.exit(0);
                            break;
                        case '2':
                            System.out.println("\n" + sortingAlgo[index]);
                            int[] arr1 = getArrayInput();
                            Sort.selection(arr1);
                            System.exit(0);
                            break;
                        case '3':
                            System.out.println("\n" + sortingAlgo[index]);
                            int[] arr2 = getArrayInput();
                            Sort.shell(arr2);
                            System.exit(0);
                            break;
                        case '4':
                            System.out.println("\n" + sortingAlgo[index]);
                            int[] arr3 = getArrayInput();
                            Sort.quick(arr3);
                            System.exit(0);
                            break;
                        case '5':
                            System.out.println("\n" + sortingAlgo[index]);
                            int[] arr4 = getArrayInput();
                            Sort.radix(arr4);
                            System.exit(0);
                            break;
                        case '6':
                            System.out.println("\n" + sortingAlgo[index]);
                            int[] arr5 = getArrayInput();
                            Sort.bubble(arr5);
                            System.exit(0);
                            break;
                        case '7':
                            System.out.println("\n" + sortingAlgo[index]);
                            int[] arr6 = getArrayInput();
                            Sort.merge(arr6);
                            System.exit(0);
                            break;
                        default:
                            continue;
                    }
                    break;
                case '0':
                    input.close();
                    System.exit(0);
                    break;
                default:
                    continue;
            }
        }
    };
}