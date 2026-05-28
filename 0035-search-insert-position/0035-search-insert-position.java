class Solution {
    public int searchInsert(int[] nums, int target) {
        ArrayList <Integer> a1=new ArrayList<>();
        for(int i:nums){
            a1.add(i);
        }
        int p=Collections.binarySearch(a1,target);
        if(p>=0){
            return p;
        }else
        return Math.abs(p)-1;
        
    }
}