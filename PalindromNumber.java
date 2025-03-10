public class PalindromNumber {

    public static void checkPalindrom(int num){
        int rev = 0;
        int originalNum = num; // Store the original number

        while(num > 0){
            int lastdigit = num % 10;
            rev = rev * 10 + lastdigit;
            num /= 10;
        }

        if(originalNum == rev){
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }
    }

    public static void main(String[] args) {
        checkPalindrom(121);
        checkPalindrom(123);
    }
}
