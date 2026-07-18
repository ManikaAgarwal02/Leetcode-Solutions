class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set=new HashSet<>();
        List<Integer> l=new ArrayList<>();
        for(int num:nums){
            set.add(num);
        }
        for(int n:set){
            l.add(n);
        }
        Collections.sort(l);
        if(l.size()<=2){
            return Collections.max(l);
        }else{
            int g=l.get(l.size()-3);
            return g;
        }

       
        
    }
}