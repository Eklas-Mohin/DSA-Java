public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int low, mid, high;
        low = 0;
        high = arr.length - 1;

        while (high >= low) {
            mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
                
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 37, 73};
        int target = 73;
        int targetIndex = binarySearch(arr, target);

        if (targetIndex != -1) {
            System.out.println("Targets index is " + targetIndex);
        } else {
            System.out.println("Target not found");
        }
    }
}