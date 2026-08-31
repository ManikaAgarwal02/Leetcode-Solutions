class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high=0;
        int low=1;
        for(int x:piles){
            high=Math.max(high,x);

        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            long ho=0;
            for(int x:piles){
                ho+=(x+mid-1)/mid;
            }
            if(ho<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
        
    }
}