class Solution {
    public int findPoisonedDuration(int[] arr, int duration) {
        int ans=0;
        for(int i=0;i<arr.length-1;i++){
            
                ans+=Math.min(duration,arr[i+1]-arr[i]);
            
        }
        ans+=duration;  
        return ans;      
    }
}