package encapsulation;
public class Encapsulation {
    public static void main(String[] args) {
        Laptop l1 =new Laptop();
        l1.setPrice(23);

    }
    public void doWork()
    {
        System.out.println("Developer working");
    }
}
 class Laptop{
    int ram;
    int price;
    public void setPrice(int price)
    {
        //is user Admin
        boolean isAdmin=true;
        if(!isAdmin)
        {
            System.out.println("You can't set the price");
        }
        else{
            this.price=price;
            System.out.println(" you set the price is "+price);
        }
    }
    
}