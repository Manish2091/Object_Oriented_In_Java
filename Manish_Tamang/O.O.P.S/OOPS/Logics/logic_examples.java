package OOPS.Logics;

public class logic_examples {

    public static void main(String[] args){
        int rowCount=4;
        //inner loop
        for(int row=0; row<4; row++)
        {
            //outer loop- spaces
            for (int col=0; col<rowCount-(row+1); col++)
            {
                System.out.print("  ");
            }
            //outer lopp-stars
            for(int col=0; col<row+1;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
