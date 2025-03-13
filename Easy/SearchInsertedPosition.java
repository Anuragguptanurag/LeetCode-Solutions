public class SearchInsertedPosition {
    public static int searchInsertedPosition(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == target) {
                return mid;  // Target found, return index
            } else if (arr[mid] > target) {
                end = mid - 1;  // Move left
            } else {
                start = mid + 1;  // Move right
            }
        }
        
        return start;  // Correct insert position
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6};
        int target = 10;
        System.out.println(searchInsertedPosition(arr, target)); // Output: 2
    }
}
