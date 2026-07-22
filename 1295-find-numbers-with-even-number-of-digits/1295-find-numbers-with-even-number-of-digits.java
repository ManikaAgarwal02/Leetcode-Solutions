class Solution {
    public int even(int a){
        int count=0;
        while(a>0){
            count++;
            a=a/10;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int ans= even(nums[i]);
            if(ans%2==0){
                c++;
            }
        }
       
        return c;
        
    }
}