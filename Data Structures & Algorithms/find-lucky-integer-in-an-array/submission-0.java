class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(0,num)+1);
        }
        for(int i = 0;i < ar.length;i++){
            if(arr[i] == map.get(arr[i])){
                return i;
            }
        }
        return -1;
    }
}