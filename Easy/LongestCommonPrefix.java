import java.util.Arrays;

public class LongestCommonPrefix {  
    public static String longestCommonPrefix(String str[]) {
        Arrays.sort(str);  // Step 1: Sort the array

        String str1 = str[0];
        String str2 = str[str.length - 1];
        int index = 0;

        while (index < str1.length() && index < str2.length()) {  // Step 2: Compare first and last string
            if (str1.charAt(index) == str2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return index == 0 ? "" : str1.substring(0, index);  // Step 3: Return the common prefix
    }

    public static void main(String[] args) {
        String str[] = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(str));  // Output ko print karna hoga!
    }
}
