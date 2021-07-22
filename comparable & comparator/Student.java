import java.util.*;

/////////comparable  interface sorting with lambda

public class Student implements Comparable<Student> {
    int marks;
    String name;
    public Student (int marks, String name) {
    super();
    this.marks=marks;
    this.name=name;
    }
    @Override
    public String toString(){
        return ("Student's marks= "+marks+" & name= "+name);
    }
    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    public String getString(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    @Override
    public int compareTo(Student obj)
    {
        if(this.marks>obj.marks)return -1;//for increasing return -1
        else if (this.marks<obj.marks) return 1;//for increasing return 1
        return this.name.compareTo(obj.name); 
    }
    public static void main(String[] args) {
    List<Student> students = new ArrayList<>();//create arraylist to store student name and data
    students.add(new Student(11, "subhajit"));
    students.add(new Student(12, "susanta"));
    students.add(new Student(14, "surajit"));
    students.add(new Student(14, "barshan"));
    students.add(new Student(15, "budhadev"));
    Collections.sort(students);
    students.forEach(System.out::println);

}
}