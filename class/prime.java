import java.util.*;

public class prime {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

    int num = 2;
    for(int i = 2 ; i * i < num ; i++){

        if(num % i == 0){
            System.out.println("False");
            return ;
        }
        
    }
    System.out.println("True");
    }
}
