
import javax.naming.spi.DirStateFactory;
import javax.naming.spi.ResolveResult;

public class AddBinary {
    public static String addBinary(String a,String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;


        while(i>=0 || j>=0 || carry >0){
           int lsdA =(i>=0)?a.charAt(i) - '0':0;
           int lsdB = (j>=0)?b.charAt(j) - '0':0;

            int total = lsdA+lsdB+carry;
            result.append(total%2);
            carry=total/2;
            i--;
            j--;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("101", "1101")); 
    }
}
