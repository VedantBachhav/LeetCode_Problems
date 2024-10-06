package COM.Vedant_LeetCode;

//Problem link : https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
// smallest char > = target.
public class Problem744CeilingOfLetters {
    public static void main(String[] args) {
        char [] letters = {'a','f','g','k'};
        char target = 'k';

        System.out.println(CeilingLetters(letters,target));
//        System.out.println(letters[2]  % letters.length);
    }
    public static char CeilingLetters(char [] letters , char target){
        int start = 0 ;
        int end = letters.length-1;
        while (start<=end){
            int mid = start + (end -start)/2;
            if(letters[mid]>target){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
