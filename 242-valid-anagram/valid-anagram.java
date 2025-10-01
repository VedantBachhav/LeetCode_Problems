class Solution {
    public boolean isAnagram(String s, String t) {
        char [] arrA = s.toCharArray();
        char [] arrB = t.toCharArray();
        if(arrA.length != arrB.length) return false;

        Arrays.sort(arrA);
        Arrays.sort(arrB);
        
        for(int i = 0; i<arrA.length; i++){
            if(arrA[i] != arrB[i]) {
                return false;
            }
        }
        return true;
    }
}