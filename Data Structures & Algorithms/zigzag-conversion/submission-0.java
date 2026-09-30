class Solution {
    public String convert(String s, int numRows) {
        if(s.length() <= numRows) return s;
        String arr[] = new String[numRows];
        for(int i = 0; i < numRows;i++){
            arr[i] = "";
        }
        int cr = 0;
        boolean g = false;
        for(char c : s.toCharArray()){
            arr[cr] += c;
            if(cr == 0 || cr == numRows - 1){
                g = !g;
            }
            cr += g ? 1 : -1;
        }
        String y = "";
        for(String c : arr){
            y += c;
        }
        return y;
    }
}