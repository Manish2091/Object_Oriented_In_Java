package OOPS.Logics;

public class Nested_Loop {
    public static void main(String[] args){

       //how many line to print
        for(int row=0; row<4; row++)
        {
            //what to print
            for(int colum=0; colum<4-row; colum++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
