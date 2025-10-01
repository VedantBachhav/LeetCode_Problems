class Solution {
    public boolean isAnagram(String s, String t) {
        // char [] arrA = s.toCharArray();
        // char [] arrB = t.toCharArray();
        // if(arrA.length != arrB.length) return false;

        // Arrays.sort(arrA);
        // Arrays.sort(arrB);

        // for(int i = 0; i<arrA.length; i++){
        //     if(arrA[i] != arrB[i]) {
        //         return false;
        //     }
        // }
        // return true;

        if(s.length() != t.length()) return false;
        int [] arr = new int[26];
        for(int i = 0;i< s.length(); i++){
            int freq = s.charAt(i) -97;
            arr[freq] +=1;
            int freq2 = t.charAt(i) -97;
            arr[freq2] -= 1; 
        }

        for(int i =0; i<26; i++){
            if(arr[i]!=0) return false;
        }
        return true;
    }
}