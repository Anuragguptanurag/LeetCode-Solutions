public class LengthofLastWord {
 public static int lengthofLastWord(String s){
    s=s.trim();
    int count =0;
    for(int i=s.length()-1;i>=0 ;i--)
    if(s.charAt(i)!=' '){
        count++;
    }else{
        break;
    }
    return count;
 }  
 public static void main(String[] args) {
    String s = "   luffy is still joyboy  ";
    System.out.println(lengthofLastWord(s));
 } 
}
