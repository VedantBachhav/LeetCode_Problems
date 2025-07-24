package COM.DSA_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class StringRevision {
    public static void main(String[] args) {

        int num1 = 18;

        int num2 = 12;
        int res = (num1<num2) ? (num1+num2) : num1-num2;
        System.out.println("Num one is "+res);
        System.out.printf("Pie value : %.4f\n",Math.PI);

            // string concatenation operator
        System.out.println('a' + 'b');// adding ascii value and disply it
        System.out.println('a' - 'b');// subtracting ascii value and disply it
        System.out.println("a"+"b");//ab is a output

        System.out.println((char)('a'+3));  // output is d bcz casting and add a +3= d
        System.out.println('a'+3);// without casting a3
        System.out.println("a"+3);// without casting a3
        System.out.println("vedant"+ new ArrayList<>());


        // String builder

        StringBuilder sb = new StringBuilder();

        for(int i =0; i<26; i++){
            char ch = (char) ('a'+i);
//            System.out.print(ch);
            sb.append(ch);
        }
        sb.insert(2,'V');
        sb.deleteCharAt(5);
        sb.reverse();
        System.out.println(sb.toString());



        // String Methods
        String a = "madaam";
        System.out.println(Arrays.toString(a.toCharArray()));

        for(int i=0; i<a.length()/2; i++){
            char start=a.charAt(i);
            char end = a.charAt(a.length()-1-i);
            if(start!=end){
                System.out.println(false);
            }
            else{
                System.out.println(true);
            }
        }
        }
    }


