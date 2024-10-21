public class CountingSort {

    public static void countingSort(int[] arr) {

        int largest = arr[0], smallest = arr[0];

        for (int i = 1; i < arr.length; ++i) {
            largest = Math.max(largest, arr[i]);
            smallest = Math.min(smallest, arr[i]);
        }

        int range = largest - smallest + 1;

        int[] count = new int[range];

        for (int i = 0; i < arr.length; ++i) {
            count[arr[i] - smallest]++;
        }

        int curr = 0;
        for (int i = 0; i < range; ++i) {
            while (count[i]-- > 0) {
                arr[curr++] = i + smallest;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {17, 23, 7, -59, 73, 13, -37, 53, 47};

        System.out.println("Unsorted Array:");
        printArray(arr);

        countingSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }
}
