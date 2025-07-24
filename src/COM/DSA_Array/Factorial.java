package COM.DSA_Array;

public class Factorial {

    public static void main(String[] args) {
        incresing(10);
    }
    public static void incresing(int n){
      if(n==1){
          System.out.print(n+" ");
          return;
      }
      incresing(n-1);
        System.out.println(n+" ");

    }
}
