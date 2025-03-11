package medium;

import java.util.Arrays;

public class ThreeSum {
    
    public static void threeSum(int arr[]){
        Arrays.sort(arr); //step 1 : sort the array
        for(int i=0 ; i<arr.length-2;i++){

            if(i>0 && arr[i]== arr[i-1]) continue; //avoid dublicate

            int left = i+1;
            int right = arr.length-1;
            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];

                if(sum==0){
                    System.out.println("[" +i+","+left+","+right + "]");
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
    }
    public static void main(String[] args) {
       int arr[]= {-1,0,1,2,-1,-4};
        threeSum(arr);
    }
}
