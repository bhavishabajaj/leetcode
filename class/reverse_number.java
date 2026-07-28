import java.util.*;
public class reverse_number {
    public static void main(String[] args) {
        int num = 5678;
        int rev_no = 0;
        while(num > 0){
            int digit = num % 10;
            rev_no = rev_no * 10 + digit;
            num /= 10;
        }
        System.out.println(rev_no);
    }
}
