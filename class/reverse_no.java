import java.util.*;

public class reverse_no {
    public static void main(String[] args) {
        int num = 131;
        int rev = 0;
        int temp = num;
        while(temp >0){
            int digit = temp % 10;
            rev = rev*10 + digit;
            temp /= 10;
        }

        if(num == rev){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
