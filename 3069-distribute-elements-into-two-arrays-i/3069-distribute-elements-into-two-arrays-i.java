class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> l=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        l.add(nums[0]);
        l2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            int a=l.get(l.size()-1);
            int b=l2.get(l2.size()-1);
            if(a>b){
                l.add(nums[i]);
            }else{
                l2.add(nums[i]);
            }


        }
        int arr[]=new int[nums.length];
        l.addAll(l2);
        for (int i = 0; i < l.size(); i++) {
        arr[i] = l.get(i);
        }

        return arr;
    }
}