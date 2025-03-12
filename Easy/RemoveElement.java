public class RemoveElement {
    public static int removeElement(int num[],int value){
    int i = 0;
    for (int j = 0; j < num.length; j++) {
        if (num[j] != value) {
            num[i] = num[j];  
            i++;
        }
    }
    return i ; 
}
public static void main(String[] args) {
int num[] ={0,1,2,2,3,0,4,2};
int value =2;
    int newlength = removeElement(num,value);
System.out.println("new length "+ newlength);
}
}
