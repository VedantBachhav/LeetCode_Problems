package COM.DSA_Recursion;

public class SumOfDigit {

    public static int sumOfDigit(int n){
        if(n==0){
            return 0;
        }
//        int a = (n%10);
//        System.out.println("N: "+a);
//        int b = sumOfDigit(n/10);
//        System.out.println("K : " +b);
//        return a+b;

        return (n%10)+sumOfDigit(n/10);


    }

    public static void main(String[] args) {
        int n =1342;
        System.out.println(sumOfDigit(n));
    }
}
