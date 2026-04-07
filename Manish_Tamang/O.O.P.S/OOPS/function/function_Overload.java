package OOPS.function;

public class function_Overload {
    public static void main(String[] args)
    {
        multiply(10, 20);
        multiply(10, 20.2f);
    }
    public static void multiply (int a, int b){
        System.out.println(a*b);

    }
        public static void multiply (int a, float b){
        float c = a*b;
        System.out.println(c);
    }
}
