class Solution {
    public boolean isPerfectSquare(int num) {
        double a=Math.sqrt(num);
        int b=(int)a;
        if(a-b==0){
            return true;
        }
        return false;

    }
}