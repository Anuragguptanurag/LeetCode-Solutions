public class RomanToInteger{
    public static int romanToInt(String s){
        if(s == null || s.length() == 0) return 0; // Empty String Handle

        int total = 0 ;
        int prev = 0;
        for(int i=s.length()-1  ; i>=0 ; i--){
            char ch = s.charAt(i);
            int curr = 0 ;

            if (ch == 'I') curr = 1;
            else if (ch == 'V') curr = 5;
            else if (ch == 'X') curr = 10;
            else if (ch == 'L') curr = 50;
            else if (ch == 'C') curr = 100;
            else if (ch == 'D') curr = 500;
            else if (ch == 'M') curr = 1000;

            // logic to add and subtract
            if(curr<prev){
                total-=curr;
            }else{
                total+=curr;
            }
            prev=curr;
        }
        return total;
    }

    public static void main(String[] args) {
        String roman = "VI";
        System.out.println("Integer Value: "+ romanToInt(roman));
    }
}
