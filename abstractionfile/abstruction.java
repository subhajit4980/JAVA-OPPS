package abstractionfile;

public class abstruction {
    public static void main(String[] args) {
        // car c1=new car;//can't creat object due to abstruct keyword
        // c1.start();
        Audi a1=new Audi();
        a1.start();

    }
}
class Audi extends car{
    @Override
    void start(){
        System.out.println("Audi is stating \nprice = 50 lakhs");
    }
}
class BMW extends car{
    @Override
    void start(){
        System.out.println("BMW is stating");
    }
}
// due to abstruct we can't create child class directly we need to Override it 
abstract class car{
    int price;
    abstract void start();
}