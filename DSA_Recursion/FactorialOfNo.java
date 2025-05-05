package COM.DSA_Recursion;

public class FactorialOfNo {
    public  static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
//        System.out.println(n);
//        int a = n*factorial(n-1);
//        System.out.println(" a a "+a);
//        return a;

        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}


//recursion tree

//5*f(4) : insert 120 into stack : return 120 bcz its top on stack
//4*f(3) : insert 24 into stack
//3*f(2) : insert 6 into stack
//2*f(1) when value is 1 then return 1; insert 2 into stack