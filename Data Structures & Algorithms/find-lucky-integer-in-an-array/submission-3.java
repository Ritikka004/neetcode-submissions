class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int largest = -1;
        for(int i : map.keySet()){
            if(i == map.get(i)){
                largest = Math.max(largest,i);
            }
        }
        return largest;
    }
}