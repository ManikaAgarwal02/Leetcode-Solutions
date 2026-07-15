class Solution {
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    
    public int gcdOfOddEvenSums(int n) {
        int sumodd=0;
        int sumeven=0;
        for(int i=1;i<=n;i++){
            sumodd=sumodd+2*i-1;
            sumeven=sumeven+2*i;
           
            }
            return gcd(sumeven,sumodd); 
        
    }
}