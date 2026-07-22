class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
               l.add(i);
            }

        }
        
        if(l.isEmpty()){
            arr[0]=-1;
            arr[1]=-1;
        }else{
            arr[0]=l.get(0);
            arr[1]=l.get(l.size()-1);
        }
        return arr;

        
        
    }
}