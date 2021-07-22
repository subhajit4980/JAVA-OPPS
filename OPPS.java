import encapsulation.Encapsulation;

public class OPPS {
   public static void main(String[] args) {
    // person p1=new person();//creating new object & calling default constructor by person
    // p1.name="subhajit";
    // p1.age=21;
    // System.out.println(p1.name+" "+p1.age);
    // person p2=new person();//creating new object & calling default constructor by person
    // p2.name="prasenjit";
    // p2.age=26;  
    // System.out.println(p2.name+" "+p2.age);
    // p1.walk();//calling method using objects
    // p2.walk();
    // p1.walk(34);
    // p2.walk(34);
    // System.out.println("constructor calls "+person.count+" times");//how much time default constructor calls
    // person p3=new person(30,"surajit");
    // System.out.println(p3.name+" "+p3.age);
    // Developer d1=new Developer(20, "avijit");
    // System.out.println(d1.name+" "+d1.age);
    // d1.doWork(3);//it calls this  dowork(3) methods from perent class
    // d1.doWork();// it call this walk() method from child class ass it's define
    Encapsulation obj = new Encapsulation();
    obj.doWork();

}
    

}

/**
 * InnerOPPS
 */
//inheritance
class Developer extends person{//child class
    public Developer(int age ,String name)
    {
        super(age,name);//calls perent's constructor
    }
    void doWork()//run time polymophisom
    {
        System.out.println("Developer "+name+" is working");
    }

}
 class person {
    int age;
    protected String name;// does not access out side of the class due to protected
    static  int count;
    public person()//default constructor
    {
        count++;
        System.out.println("creating an object");
    }
    public person(int age,String name)//creating constructor with parameter or arguments
    {   this();//this() call same class different constructor
        this.name=name;//this.name &  this.age calls this constructor's perameter
        this.age=age;
    }
     void walk()// methods
    //compile time polymophisom
    {
        System.out.println(name+" "+"walking");
    }
    void walk(int steps)//methods with arguments
    //compile time polymophisom
    {
        System.out.println(name+" "+"walking "+steps+" steps");
    }
    void doWork()//compile time polymophisom
    {
        System.out.println("Developer "+name+" is working");
    }
    void doWork(int time) //compile time polymophisom
    {
        System.out.println(name+" is working since"+ time);
    }
    
}