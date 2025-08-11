class Solution {
    public int compress(char[] chars) {
       String s = "";
       if(chars.length == 0) return 0;
       s+=chars[0];

        int count = 1;
        for(int i = 1; i<chars.length; i++){
            if(chars[i]==chars[i-1]){
                count++;
            }
            else{
                if(count>1){
                    s += count;
                    count=1;
                }
                s+=chars[i];
            }
        }
        if(count>1){
            s+=count;
        }
        char [] ch= s.toCharArray();
        for(int i = 0; i<ch.length; i++){
            chars[i]=ch[i];
        }
        return ch.length;
    }
}