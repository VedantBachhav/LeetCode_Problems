package COM.Vedant_LeetCode;

public class problem_344_reverse_string {
    public static void main(String[] args) {
//        char [] s = {'h','e','l','l','o'};
//        int start = 0;
//        int end = s.length-1;
//        while(start<end){
//            char swap = s[start];
//            s[start]=s[end];
//            s[end] = swap;
//            start++;
//            end--;
//        }
//        System.out.println(s);

        String s ="Vedant";
        char a [] = s.toCharArray();

        int start =0;
        int end = a.length-1;
        while(start<end){
            char swap = a[start];
            a[start]=a[end];
            a[end]=swap;

            start ++;
            end --;

        }
        System.out.println(a);

    }
}
