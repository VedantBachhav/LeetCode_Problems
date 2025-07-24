public class Pattern {

    public static void main(String[] args) {

        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern6(5);

        pattern21(5);
    }
    public static void pattern1(int n){
        System.out.println("\nPattern Number 1 : ");
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n) {
        System.out.println("\nPattern Number 2 : ");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

        public static void pattern3(int n){
            System.out.println("\nPattern Number 3 : Increment and decrement both.");
//            for (int row = n; row >= 1; row--) {
//                for (int col = row; col >=1; col--) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }

//            another one approch for this with increment operator
            for (int row = 1; row <= n; row++) {
                for (int col =1; col <=n-row+1; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }

    public static void pattern4(int n){
        System.out.println("\nPattern Number 4 : ");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        System.out.println("\nPattern Number  : 6");
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <=n-row; col++) {
                System.out.print(" ");
            }
            for(int star= 1; star<=row;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void pattern21(int n){
        System.out.println("\nPattern Number  : 21");
        int count =1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void pattern26(int n){
        System.out.println("\nPattern Number  : 26");
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <=n-row; col++) {
                System.out.print(" ");  
            }
            for(int star= 1; star<=row;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    }

