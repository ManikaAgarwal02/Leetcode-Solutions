class Solution {
    public int lengthOfLastWord(String s) {
        String str="";
        String []arr=s.split(" ");
        str=str+arr[arr.length-1];
        return str.length();
        
    }
}