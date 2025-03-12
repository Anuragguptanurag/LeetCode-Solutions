public class DublicateRemove {
    public static int dublicateRemove(int num[]) {
        int i = 0;
        for (int j = 1; j < num.length; j++) {
            if (num[j] != num[i]) {
                num[i + 1] = num[j];  // Next position pe unique value store karo
                i++;
            }
        }
        return i + 1; // Unique elements count
    }

    public static void main(String[] args) {
        int num[] = {1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 6, 7, 9, 9};
        int uniqueCount = dublicateRemove(num);
        
        // Print unique elements
        System.out.print("Unique elements: ");
        for (int k = 0; k < uniqueCount; k++) {
            System.out.print(num[k] + " ");
        }
        System.out.println("\nTotal unique elements: " + uniqueCount);
    }
}
