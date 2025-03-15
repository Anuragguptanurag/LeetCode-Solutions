public class PlusOne{
    public static int[] plusOne(int arr[]){
        for(int i=arr.length-1 ;i>=0 ;i--){
            if(arr[i]<9){
                arr[i]= arr[i]+1;
                return arr;
            }
            arr[i]=0;
        }
        int newsize[] = new int[arr.length+1];
        newsize[0]=1;
        return newsize;
    }
    public static void main(String[] args) {
        int arr[] ={9,9,9};
       int arr2[]=plusOne(arr);
       for(int i=0 ;i<arr2.length ;i++){
        System.out.print(arr2[i]+" ");
       } 
    }
}