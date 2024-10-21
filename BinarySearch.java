public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (high >= low) {
            int mid = (high + low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 8, 9, 10, 11, 11, 12, 14};
        int target = 14;
        int targetIndex = binarySearch(arr, target);

        if (targetIndex != -1) {
            System.out.println("Targets index is " + targetIndex);
        } else {
            System.out.println("Target not found");
        }
    }
}
