package OOPS.Logics;
import java.util.*;
public class floyds_Triangle {
    public static void main(String[] args){
        int counter=1;
        //outer loop
        for(int row=0; row<5; row++)
        {
            //inner loop- number
            for (int col=0; col<row+1; col++)
            {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }

    }
}
