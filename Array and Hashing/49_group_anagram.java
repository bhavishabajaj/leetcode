class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();
        for(int i = 0 ; i<strs.length ; i++){
            char[] sorted = strs[i].toCharArray();
            Arrays.sort(sorted);
            String sort = new String(sorted);
            if(!map.containsKey(sort)){
                map.put( sort , new ArrayList<>());
            }
            map.get(sort).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}