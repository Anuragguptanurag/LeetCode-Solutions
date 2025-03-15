public class MergeSortedArray {
    
    public static void mergeSortedArray(int[] num1, int m, int n, int[] num2) {
        int p1 = m - 1;  // num1 ke last filled element ka index
        int p2 = n - 1;  // num2 ke last element ka index
        int p = m + n - 1; // num1 ke last index par
        
        // Jab tak dono arrays traverse ho rahe hain
        while (p1 >= 0 && p2 >= 0) {
            if (num1[p1] > num2[p2]) {
                num1[p] = num1[p1];
                p1--;
            } else {
                num1[p] = num2[p2];
                p2--;
            }
            p--;
        }
        
        // Agar num2 me elements bache ho toh unhe copy karna padega
        while (p2 >= 0) {
            num1[p] = num2[p2];
            p2--;
            p--;
        }
    }

    public static void main(String[] args) {
        int num1[] = {1, 2, 3, 0, 0, 0}; // First array with extra space
        int num2[] = {2, 5, 6}; // Second sorted array
        int m = 3;
        int n = 3;
        mergeSortedArray(num1, m, n, num2);
        
        // Printing merged sorted array
        System.out.print("Merged Sorted Array: ");
        for (int element : num1) {
            System.out.print(element + " ");
        }
    }
}
