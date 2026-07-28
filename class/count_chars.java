import java.util.*;

public class count_chars {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch , 1 );
            }
            else{
            map.put(s.charAt(i) , map.get(ch) + 1);
            }
        }
        System.out.println(map);
    }
}