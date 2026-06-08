import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> visited = new HashSet<>();
        
        while(n != 1 && !visited.contains(n)) {
            visited.add(n);
            int ne = 0;
            int temp = n;
            
            while(temp != 0) {
                int rem = temp % 10;
                ne += rem * rem;
                temp /= 10;
            }
            
            n = ne; // move to next number
        }
        
        return n == 1;
    }
}
