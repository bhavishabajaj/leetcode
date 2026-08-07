class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int j = 0;
        int i = people.length - 1;
        int count = 0;
        while(j<=i){
            // if(i==j){
            //     count++;
            //     break;
            // }
            count++;
            int sum = people[i] + people[j];
            if(sum <= limit){
                j++;
                // count++;
            }
            // else{
            //     count++;
            //     i--;
            // }
            i--;
        }
        return count;
    }
}