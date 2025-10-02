class Solution {
    public String reverseWords(String str) {
       String s =  str.trim().replaceAll("\\s+"," ");

        String [] arr = s.split(" ");
        int start = 0, end = arr.length-1;
        while(start<end){
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return String.join(" ", arr);    
        }
}