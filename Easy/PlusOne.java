public class PlusOne {
    public static void plusOne(int digit[]){
        int sum =0 ;
        for(int i=0 ; i<digit.length ;i++){
            sum+=Math.pow(10, i)*digit[digit.length-1-i];
        }
        System.out.println(sum+1);
    }
    public static void main(String[] args) {
        int digit[] = {1,2,3};
        plusOne(digit);
    }
}
