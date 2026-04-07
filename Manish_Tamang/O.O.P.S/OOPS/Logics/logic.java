package OOPS.Logics;

public class logic {
    public static void main(String[] args){

        for (int row=0; row<4; row++)
        {
        for (int column=0; column<row+1; column++)

            {
                System.out.print(column+1);
            }
        System.out.println();
        }
    }
}
