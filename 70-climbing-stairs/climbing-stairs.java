class Solution {
    public int climbStairs(int n) {
        if(n==0 || n==1){
            return 1;
        }
        int prev = 1, curr= 1, next=0;
        for(int i = 2; i<=n; i++){
            next = prev+curr;
            prev=curr;
            curr=next;
        }
        return next;
    }
}