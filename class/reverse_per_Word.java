import java.util.*;

public class reverse_per_Word {
    public static void main(String[] args) {
        String s = "Hello world";
        String[] words = s.split(" ");
        for(String word : words){
            System.out.print(new StringBuilder(word).reverse() + " ");
        }
    }
}
