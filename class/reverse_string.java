import java.util.*;

public class reverse_string {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    StringBuilder sb = new StringBuilder();
    for(int i = 0 ; i<s.length() ; i++){
        sb.append(s.charAt(i));
    }
    System.out.println( sb.reverse().toString());
    }
}
