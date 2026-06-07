class Solution {
    public String reverseWords(String s) {
        String[] w=s.trim().split("\\s+");
        StringBuilder st=new StringBuilder();
        for(int i=w.length-1;i>=0;i--){
            st.append(w[i]);
            if(i!=0){
                st.append(" ");
            }
        }
        return st.toString();
        
    }
}