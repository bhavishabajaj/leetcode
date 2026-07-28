import java.util.*;
public class palindrome {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int i = 0;
    int j = s.length() - 1 ;
    boolean pl = true;
    while(i<=j){
        if(s.charAt(i) != s.charAt(j)){
            System.out.println("Not Palindrome");
            pl = false;
            break;
        }
        i++;
        j--;
    }
    if(pl){
        System.out.println("Palindrome");
    }
    
    }
}
