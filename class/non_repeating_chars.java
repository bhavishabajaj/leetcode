import java.util.*;

public class non_repeating_chars {

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
        // for(char ch : map.keySet()){
        //     if(map.get(ch) == 1){
        //         System.out.println(ch + ":" + map.get(ch));
        //         break;
        //     }
        // }
        // cant use this coz we need first non repeating digit's occurence ... hashmap doesnt maintain order
        boolean found = false;
        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i) ;
            if(map.get(ch) == 1){
                System.out.println(ch);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println(" No repeating exists b");
        }
    }
}