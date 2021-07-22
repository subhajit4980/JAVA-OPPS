package abstractionfile;

public class Car implements Cars,person{//multiple interfaces
    public static void main(String[] args) {
        // start c1=new start();
       
    }
@Override
public void start(){
    System.out.println("car is starting");

 }
@Override
public void walk() {
   
    
}
}
interface Cars{
    void start();
    //functions are abstructs bydefault.
    //we can't create body part of function 
}
interface person{
    void walk();
}
