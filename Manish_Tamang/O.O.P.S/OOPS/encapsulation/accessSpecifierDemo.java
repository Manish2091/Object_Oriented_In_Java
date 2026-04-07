package OOPS;

public class accessSpecifierDemo {
    public static void main(String args[]){
        Bank b1 = new Bank();
        b1.setPassword("manishworld");
        System.out.println(b1.getPassword());


    }
}

class Bank{
    private String password;
    void setPassword(String password) {
        this.password=password;
    }
    String getPassword(){
        return this.password;
    }
}
