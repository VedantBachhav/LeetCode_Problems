package COM.DSA_Recursion;

public class PatternUsingRecursion {
    public static void main(String[] args) {
        patter1(4,0);
        System.out.println("\n\n\n");
        patter2(4,0);

   }
    static void patter1(int row, int col){
        if(row==0){
            return;
        }
        if(row > col){
            patter1(row,col+1);
            System.out.print(" X ");
        }
        else{
            patter1(row-1,0);
            System.out.println();
        }
    }

    static void patter2(int row, int col){
        if(row==0){
            return;
        }
        if(row > col){
            System.out.print(" X ");
            patter2(row,col+1);

        }
        else{
            System.out.println();
            patter2(row-1,0);

        }
    }


}

